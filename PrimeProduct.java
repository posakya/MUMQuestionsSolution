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
public class PrimeProduct {
    
    
    public static void main (String [] args){
        System.out.println(isPrimeProduct(35));
    }
    
     static int isPrimeProduct(int n){
       
        int isPrimeProduct = 0;
            
            for(int i=2; i<=n; i++){
                for(int j=2; j<=n;j++){
                    if(i*j == n){
                       
                        boolean isPrime = IsPrime(i);
                        boolean isPrime1 = IsPrime(j);
                        
                        if(isPrime && isPrime1){
                         
                             isPrimeProduct = 1;
                             break;
                             
                        }
                        
                    }
                }
            }
        
        
        return isPrimeProduct;
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
