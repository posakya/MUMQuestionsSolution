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
public class MeeraArray {
    
    public static void main(String []args){
        int[] a =   {-4, 0, 1, 0, 2, 1} ;
        System.out.println(isMeera1(a));
    }
    
    
    static int isMeera(int[] a){
        for(int i=0; i<a.length; i++){
            int isMeera = 1;
            for(int j=0; j<a.length; j++){
                if(a[i] == 0){
                    isMeera = 0;
                    break;
                }
                if(a[i] == -a[j]){
                    isMeera = 0;
                    break;
                }
            }
            
            if(isMeera == 0){
                return 0;
            }
        }
        return 1;
    }
    
    static int isMeeraArray(int[] a){
        for(int i=0;i<a.length;i++){
            int isMeera =1;
            for(int j=1;j<a.length;j++){
                if(a[i] == 2*a[j]){
                    isMeera =0;
                    break;
                }
            }
            
            if(isMeera ==0){
                return 0;
            }
        }
        
        return 1;
    }
    
    static int isMeera1(int [] a){
        int sum = 0;
        int isMeera = 0;
        
        
        for(int i=0; i<a.length;i++){
            
            sum +=a[i];
               
        }
        
        if(sum == 0){
             for(int j=0; j<a.length-1;j++){
                 if((a[j]<j)){
                     
                         isMeera = 1;
                     
                }else{
                     isMeera = 0;
                     break;
                 }
            }
        }
   
        
        return isMeera;
    }
    
    static int isMeera2(int[] a){
       int isMeera = 0;
        for(int i=0;i<a.length;i++){
            boolean isPrime = IsPrime(a[i]);
            if(isPrime){
                for(int j=0; j<a.length;j++){
                    if(a[j] == 0){
                        isMeera = 1;
                    }
                }
            }
        }
        
        return isMeera;
    }
    
    static int isMeera3(int[] a){
       int isMeera = 0;
        for(int i=0;i<a.length;i++){
//            boolean isPrime = IsPrime(a[i]);
            if(a[i] == 9){
                for(int j=0; j<a.length;j++){
                    if(a[j] == 1){
                        isMeera = 1;
                    }
                }
            }
        }
        
        return isMeera;
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
