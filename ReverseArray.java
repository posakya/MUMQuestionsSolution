/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.Arrays;

/**
 *
 * @author roshan
 */
public class ReverseArray {
    
    public static int[] reverse(int[] array) {
    
    int j = array.length-1;
    
        for(int i=0; i<=j; i++)
        {
             int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
           j--;
        }
         System.out.println("Reverse Array : "+ Arrays.toString(array));
         return array;
    }
    
      public static void main(String []args){
        int[] data = {1,2,3,4,5,6,7,8,9};
        reverse(data);
         
    }
    
}
