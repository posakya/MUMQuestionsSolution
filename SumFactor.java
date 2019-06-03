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
public class SumFactor {
    
    public static void main (String []args){
        int[] a = {1, 2, 3, 4};
        System.out.println(sumFactor(a));
    }
   static int sumFactor(int[ ] a){
       int factorValue = 0;
       int sum =0;
       
       for(int i=0;i<a.length;i++){
           sum +=a[i];
       }
       
       for(int i=0;i<a.length;i++){
           if(a[i] == sum){
               factorValue++;
           }
       }
       
       return factorValue;
       
    }
    
}
