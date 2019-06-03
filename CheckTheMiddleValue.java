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
public class CheckTheMiddleValue {
    
    public static void main(String []args){
        
        Scanner s = new Scanner(System.in);
      
        System.out.println("Enter array of number : ");
        int count = s.nextInt();
         
        int [] a = new int[count]; 
        
        for(int i=0; i<a.length;i++){
           System.out.println("Enter numbers : "+i);
           a[i] = s.nextInt();
        }
        
        subtract(a);
        
    }
    static void subtract(int[] n){
        
        int even =0;
        int odd = 0;
        
        for(int i=0; i<n.length; i++){
            
            if(n[i]%2==0){
                even +=n[i];
            }else {
                odd +=n[i];
            }
        
       }
        int Results = odd-even;
        System.out.println("Result : "+Results);
        
    }
    
}
