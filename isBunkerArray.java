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
public class isBunkerArray {
    
    public static void main (String [] args){
        
        int[] a ={7,6,10,1,5};
        System.out.println(isBunkerPrime(a));
        
       
    }
    
    static int isBunkerPrime(int[] a){
        
//        int isBunker = 0;
        
       
        for(int i=0; i<a.length-1; i++){
           
         if(a[i] %2 != 0){
             
              boolean isPrime = IsPrime(a[i+1]);
              if(isPrime){
                 return 1;
              }
         }
        
            
        }
                 
        return 0;
    }
    
     static int isBunkerSquare(int[] a){
        
        int isBunker = 0;
       
        for(int i=0; i<a.length-1; i++){
           
         if(a[i] %2 != 0){

                boolean isSquare = IsSquare(a[i+1]);
             
                if(isSquare){

                     isBunker = 1;
                     break;

              }
         }
        
            
        }
                 
        return isBunker;
    }
     
     static int isBunker(int[] a){
         int isBunker = 0;
         
         for(int i=0; i<a.length;i++){
             boolean isPrime = IsPrime(a[i]);
             
             if(isPrime){
                 for(int j=0;j<a.length;j++){
                     if(a[j] == 1){
                       return 1;
                     }
                 }
             }
         }
         
         return 0;
     }
     
    static boolean IsSquare(int n){
        if(n<=1)
            return false;
        
        for(int i=2; i<=n; i++){
            if(i*i == n){
                return true;
            }
        }
        return false;
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
