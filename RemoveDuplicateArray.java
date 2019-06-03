/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.Arrays;

/**
 *
 * @author lokesh
 */
public class RemoveDuplicateArray {
    
    public static void main (String []args){
        int[] a = {-4, 1, 3, 1, 6};
        duplicate(a);
    }
    
    static void duplicate(int[] a){
        
        
        int[] array = new int[a.length];
        int size = array.length;
         
        //// copy array ////
         for(int i=0; i<size; i++){
             for(int j=i+1;j<size; j++){
                 
                 if(a[i]==a[j]){
                     a[j] = a[size-1];
                     size --;
                 }
             }
         }
         
         ///// sort the array ////
          for (int i=0; i<size; i++) {
                         for(int m=0;m<size;m++){
                             if(a[i]<a[m]){
                               int temp = a[i];
                               a[i] = a[m];
                               a[m] = temp;
                                 
                             }
                         }
                    }
          System.out.println(Arrays.toString(a));
          //// remove duplicate item ////
          
//          for(int i=0; i<size;i++){
//              System.out.println(a[i]+" ");
//          }
          
          //// getting array elements whose sum equals to 6 ////
//          int val = 6;
//          int first=0, second=0;
//          for(int i=0; i<a.length;i++){
//              first = a[i];
//              for(int j=0; j<a.length;j++){
//                  second = a[j];
//                  
//                  if((first + second) == val ){
//                      System.out.printf("(%d, %d) %n", first, second);
//                     return;
//                  }
//              }
//          }
//          
          
          
          
         int sum = 0;
         for(int i=0; i<size; i++){
             sum += a[i];
              //System.out.println(sum);
             if(sum == 0){
                
                 System.out.println(a[i]);
                
             }
          
            
         }
         
         
    }
}
