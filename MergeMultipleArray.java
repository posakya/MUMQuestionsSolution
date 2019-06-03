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
public class MergeMultipleArray {
     
    public static void main(String []args){
        
        int[] inputArray1 = {2,8, 3, 4, 7, 12};
        
        int[] inputArray2 = {8, 4, 6, 2, 13};
         
        int[] inputArray3 = {7,8, 9, 4, 1};
         
        intersection(inputArray1,inputArray2, inputArray3);
        
    }
    
    static void union(int[] ... arrays)
    {
        
         int l =0;
       
         for(int[] array : arrays){
            ///// get total array elements length ////
             l +=array.length;
            }
             ///// create a new result array after merging an arrays ////
             int[] c = new int[l];
             
                int j=0;
             
                for(int[] array : arrays)
                {
                    ///// copy all array data into c result array ////
                   for(int i =0; i<array.length && j<l;i++,j++){
                   c[j]= array[i];
                   
              }  

        }
                /// sorting the result array to remove the duplicate array///
                    int t=0;
                    int n=c.length;
                    int[] temp1 = new int[n];
                     for (int i=0; i<c.length; i++) {
                         for(int m=i+1;m<c.length;m++){
                             if(c[i]<c[m]){
                               int temp = c[i];
                               c[i] = c[m];
                               c[m] = temp;
                                 
                             }
                         }
                    }
                     
                    ///// creating temp array to copy the array from c result array //// 
                    for (int k=0; k<c.length-1; k++){  
                        if (c[k] != c[k+1]){  
                           // c[t++] = c[k];  
                            temp1[t++] = c[k];
                         }  
                     } 
                    
                   temp1[t++] =c[n-1];
              

        //// final result array after removing the duplicate elements //////           
        int[] retArray = new int[t];     
        for (int i = 0; i < retArray.length; i++)
        retArray[i] = temp1[i];
        
        
        System.out.println(Arrays.toString(retArray));
 
    }
    
    static void intersection(int[] ... arrays){
         int l =0;
       
         for(int[] array : arrays){
            ///// get total array elements length ////
             l +=array.length;
             
            }
             ///// create a new result array after merging an arrays ////
             int[] c = new int[l];
             
                int j=0;
                int s=0;
                
            
                for(int[] array : arrays)
                {
                    ///// copy all array data into c result array ////
                   for(int i =0; i<array.length && j<l;i++,j++){
                    
                       c[j] = array[i];
                   
                }  

        }
                /// sorting the result array to remove the duplicate array///
                    int t=0;
                    int n=c.length;
                    int[] temp1 = new int[n];
                     for (int i=0; i<c.length; i++) {
                         for(int m=i+1;m<c.length;m++){
                             if(c[i]>c[m]){
                               int temp = c[i];
                               c[i] = c[m];
                               c[m] = temp;
                                 
                             }
                         }
                    }
                     
                    ///// creating temp array to copy the array from c result array //// 
                    for (int k=0; k<c.length-1; k++){  
                        if (c[k] != c[k+1]){  
                            
                            temp1[t++] = c[k];
                         }  
                     } 
                    
                   temp1[t++] =c[n-1];
              

        //// final result array after removing the duplicate elements //////           
        int[] retArray = new int[t];     
        for (int i = 0; i < retArray.length; i++)
        retArray[i] = temp1[i];
        
        
        System.out.println(Arrays.toString(retArray));
 
    }
}
