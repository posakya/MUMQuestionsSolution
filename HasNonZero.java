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
public class HasNonZero {
    
    public static void main (String []args){
        int[] a = {1};
        System.out.println(hasNonZero(a));
    }
    
    static int hasNonZero(int[] a){
        
        int hasNonZero =  1;
        
        for(int i=0; i<a.length;i++)
            
            if(a[i] == 0){
                hasNonZero = 0;
                
            }
           
   
       return hasNonZero;
    }
    
}
