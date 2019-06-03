/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author lokesh
 */
public class isFill {
    public static void main(String [] args){
        int[] a={4, 2, -3, 12};
//        int k=1;
//        int n=5;
     fill(a, 1, 5) ;
    }
    
    static int[] fill(int[] arr,int k,int n){
    
        int[] array = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(k>0){
                array[i] = arr[j];
                j++;
                
             if(j>=k){
                 j=0;
             }   
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    
    }
    
}
