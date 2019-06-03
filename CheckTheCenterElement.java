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
public class CheckTheCenterElement {
    
    public static void main (String []args){
        
//        Scanner s = new Scanner(System.in);
//        
//        System.out.println("Enter array of number : ");
//        int count = s.nextInt();
//         
//        int [] a = new int[count]; 
//        
//        for(int i=0; i<a.length;i++){
//           System.out.println("Enter numbers : "+i);
//           a[i] = s.nextInt();
//        }

        int[] a = {3,2,1,4,5};
        
        System.out.println(centerElement(a));
        
        
        
    }
    
    static int centerElement(int[] a){
       
        if(a==null || a.length % 2 ==0){
              System.out.println("0");
            return 0;
        }
          
       
        int midIndex = a.length /2;
        int midItem = a[midIndex];
        
        
        for(int i=0; i<a.length; i++){
            
            if(i != midIndex && midItem>=a[i]){
               
                return 0;
            }
        }
           
        return 1;
        
        
    }
    
}
