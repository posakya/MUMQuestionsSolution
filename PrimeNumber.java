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
public class PrimeNumber {
    
    public static void main (String [] args){
       // primeCount(1,3);
        int result = primeCount1(10,20);
        int[] a = {1,0,3};
        System.out.println(hasNonZero(a));
    }
    
    
    static int primeCount1(int start,int end){
        
        int primeCount = 0;
        
        for(int i=start; i<=end; i++){
            if(i>1){
                boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                   isPrime = false;
                   break;
                }
            }
            
            if(isPrime)
            {
                 primeCount++;
            }
               
            } 
        }
        
        return primeCount;
    }
    
 
    
       static int hasNonZero(int[] a){
        
        boolean hasNonZero =  true;
        for(int i=0; i<a.length;i++)
            if(a[i] == 0){
                hasNonZero = false;
                return 0;
            }
               
            if(hasNonZero){
                return 1;
            }
   
       return 1;
    }
    
}
