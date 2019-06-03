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
public class lastEven {
    
    public static void main(String [] args){
        int[] a = {4,5,6,7,3};
        System.out.println(lastEven(a));
    }
    
   static int lastEven(int [] a){
       int lastEven = -1;
        for(int i=a.length-1; i>=0; i--){
       
            if(a[i] % 2 == 0){
               
                lastEven = i;
                break;
                
            }
        }
        
        return lastEven;
    }
    
}
