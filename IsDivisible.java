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
public class IsDivisible {
    
    public static void main(String [] args){
        int[] result = {3,3,6,36};
        int div = 3;
        //System.out.println(isDivisible(result,div));
        //power(3,4);
       // primeFactor(420);
        int[] a = {1, 1, 0, 1};
        int n =2;
        //System.out.println(isLegalNumber(a,n));
        System.out.println(isSquare(4));
    }
    
    static int isDivisible(int [] a, int div){
        
        int isDivisible = 1;
        
        for(int i=0; i<a.length; i++)
            
            if(a[i] % div != 0 ){
               
                isDivisible = 0;
                
            }
        
        return isDivisible;
    }
    
    static void primeFactor(int n){
        
        for(int i=1; i<n; i++)
            if(n%i ==0){
                n = n/i;
            }
        System.out.println(n);
        
    }
    
    static int isSquare(int n){
        
        for(int i=0; i<=n ; i++)
            if( i*i == n){
               return 1;
               
            }
        
        return 0;
    }
    
    static int isNUnique (int[] a, int n){
        
        int isUnique = 0;
        
        for(int i=0; i<a.length;i++)
            for(int j=i+1; j<a.length;j++)
                
                if(a[i] + a[j] == n){
                    if(isUnique == 0)
                    isUnique = 1;
                    else
                        isUnique = 2;
                }
        
        if(isUnique == 2){
            isUnique =0;
        }
           
        
        return isUnique;
    }
    
    static int isLegalNumber(int[] a, int n){
        
        int isLegalNumber = 1;
        int size = a.length;
        
        for(int i=0; i<a.length; i++)
            if(a[i] >= n){
                
                isLegalNumber = 0;
                
            }
        int sum =0;
        int pow = 1;
        if(isLegalNumber == 1){
            
            for(int i = 0; i<size; i++){
                 
                 sum +=(a[i] * pow);
                 
                 pow *= n;
                 
                 }
            
           System.out.println("Sum : "+sum);
         
        }
        
        return isLegalNumber;
    }
    
    static void power(int n,int m){
        double v=1;
        long val = 0;
        for(int i=1;i<=m;i++){
            
          // v *= n;
            v = Math.pow(n,i);
            val = (long) v;
           
        }
        System.out.println(val);
    }
}
