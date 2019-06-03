/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.Scanner;

/**
 *
 * @author lokesh
 */
public class SampleDatastructure {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) {
        
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter first number : ");
//        
//        int n1 = scanner.nextInt();
//        
//        System.out.println("Enter second number : ");
//        
//        int n2 = scanner.nextInt();
//        
//        System.out.println("Enter the number of elements");
//        int number = scanner.nextInt();
//        
//        int n3 = 0;
//         
//        //int factorial = 1;
//        
////        for(int j=2, j= 0;j<=number; ++j){
////            n3 = n1 + n2;
////            n1=n2;
////            n2=n3;
////        }
//
//        System.out.println("Fibonai series : "+n1);
//        System.out.println("Fibonai series : "+n2);
//        
//        for(int i=2; i<=number; ++i){
//             n3 = n1 + n2;
//             System.out.println("Fibonai series : " +n3);
//             n1=n2;
//             n2=n3;
//        }
//        
//        
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter string : ");
//     String n = sc.nextLine();
//     reverse(n);
 
    
}
    
    static String reverse(String n){
        
//     int temp,rem,rev=0;
//     temp=n;
        
        StringBuilder sb = new StringBuilder(n);
        
        System.out.println("Reversed string is: "+sb.reverse().toString());
        System.out.println("Original number : "+n);
        
      
//        for(int i=chars.length()-1; i>=0;i--){
//            reverseChar = reverseChar + (chars.charAt(i));
//        }
//        
//        System.out.println("Reverse : "+reverseChar);
        
     
//     while(n>0){
//         rem = n % 10;
//         rev = rev*10+rem;
//         n /=10;
//     }
//     System.out.println("Original number : "+temp);
//     System.out.println("Reverse Value : "+rev);
//     
//     if(temp==rev){
//         System.out.println("This is palindrome number");   
//     }else {
//         System.out.println("This is not a palindrome number");
//     }
    
     return sb.reverse().toString();
    
    }
    
    static int armStrong(int n){
        int sum=0,rem,temp,cube,isArmStrong=0;
        
        temp =n;
        
       while (n>0){
           
           rem = (n%10);
           cube = rem*rem*rem;
           sum += cube;
           n = n/10;
           
       }
       if(sum == temp){
           isArmStrong = 1;
       }
        
        return isArmStrong;
    }
    
   
}

