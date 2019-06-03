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
public class isPaired {
    
    public static void main(String [] args){
        int[] a ={7, 15, 9, 2, 3};
        System.out.println(isPaired(a));
    }
    
    static int isPaired(int [] a){
        
        for(int i=0;i<a.length;i++){
           if(i%2 == a[i]%2){
               
               return 0;
           }
        }
        
        return 1;
    }
    
}
