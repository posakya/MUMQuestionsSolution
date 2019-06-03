/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;


/**
 *
 * @author lokesh
 */
public class MagicArray {
    
    public static void main (String [] args){
        int [] a ={21, 3, 7, 9, 11, 4, 6};
        System.out.println(isMagicArray(a));
        
        
    }
    
    static int isMagicArray(int[] a){
        
        int isMagicArray = 0;
        
        int sum = 0;
        
        for(int i=0; i<a.length;i++){
         
            boolean isPrime = IsPrime(a[i]);
             
                if(isPrime){
                   sum += a[i];
                   
                    if(a[0] == sum){
                       
                       isMagicArray = 1;
                       break;
                   }
                 
               }
                
               
        }
        
        return isMagicArray;
    }
    
    
  
     
    static boolean IsPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
      
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
      
        return true;
    }
    
}
