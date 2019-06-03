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
public class isLegal {
    
    public static void main (String [] args)
    {
        int[] a = {3,2,5};
        int n =8;
        //System.out.println(isLegalNumber(a,n));
        
        int[] a1 = {1,0,1,1};
        int n1 = 2;
        
        
        
        System.out.println(isLegalNumber(a1,n1));
    }
    
      static int isLegalNumber(int[] a, int n){
        
        int isLegalNumber = 1;
        int size = a.length;
        int sum =0;
        int pow = 1;
        
        for(int i=0; i<a.length; i++)
            if(a[i] >= n){
                
                isLegalNumber = 0;
                
            }
         
        if(isLegalNumber == 1){
            
            for(int i = size-1; i>=0; i--){
                 
                 sum +=(a[i] * pow);
           
                 pow *= n;
                               
            }
            
          System.out.println("Sum : "+sum); 
        }
        
        return isLegalNumber;
    }
    
}
