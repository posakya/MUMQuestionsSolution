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
public class isSumSafe {
    
       
    public static void main(String [] args){
        int[] a ={5,-2,0,3};
        System.out.println(isSumSafe(a));
      
    }
    
      static int isSumSafe(int [] a){
          
          int isSumSafe = 1;
          int sum =0;
         
          for(int i=0; i<a.length; i++){
              sum +=a[i];  
          }
          
         for(int j=0; j<a.length; j++)
              
              if(sum == a[j]){
                  isSumSafe = 0;
              }
         
          System.out.println("sum : "+sum);
          return isSumSafe;
      }
}
