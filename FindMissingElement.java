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
public class FindMissingElement {
    
    public static void main (String [] args){
        
        //int[] a = {7,3,5,6};
////      //  missingValue(a,10);
////        
        //
        //missingNumber(a);
        
        int arr1[] = {6};
        //int b[] = { 1,2,3,7,6,8,9,10,11,12 };
        //FindMissingValue(a,10);
        
       // int arr2[] = { 20,25,30,40,50};
        int arr2[] = { 3,2,10,1,13 };
        
       int temp=0;
        for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                
                //// for ascending orders /// 
                if(arr1[i] < arr1[j]){
                    temp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                    
                }
            }
        }
        
        int temp1=0;
        for(int i=0; i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                
                //// for ascending orders /// 
                if(arr2[i] < arr2[j]){
                    temp1 = arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp1;
                    
                }
            }
        }
        //int arr2 = 10;
        int n1 = arr1.length;
        int n2 = arr2.length;
 
        printUncommon(arr1, arr2, n1, n2);
  
   

}
    
    /// for single elements
    static int missingValue(int[] a,int totalCount){
        
        int expectedSum = (totalCount*(totalCount+1))/2;

        int number=0;
        
        for(int i : a){
           number +=i;      
        }
      
        System.out.println("Number : "+number);
        System.out.println("Expected : "+expectedSum);
        System.out.println("Number : "+(expectedSum - number));
        
        return number;
    }
    
  
    static void printUncommon(int arr1[], 
                     int[] arr2, int n1, int n2)
    {
 
       // int[] arr2 = new int[arr3];
        
        
        
        int i = 0, j = 0;
        
//        for(int l=0; l<arr3;l++){
//            arr2[l]=l+1;
//        }

        int[] real,given;
        
        int length = (arr1.length > arr2.length)?arr1.length : arr2.length;
       
        if(length == arr1.length){
            real = arr1;
            given = arr2;
        }else {
            real = arr2;
            given = arr1;
        }
        
        int[] required = new int[length] ;
        int temp = 0;
        int l=0;
        
       for(int O=0; O<real.length;O++)
            for(int p =0; p<given.length; p++)
                if(given[p] == real[O]){
                    
                    required[l] = given[p];
                    
                    l++; 
                    
                }
       
        int[] retArray = new int[l];
        
        for (int t = 0; t < retArray.length; t++)
        retArray[t] = required[t];
        
        System.out.println("Common : "+Arrays.toString(retArray));
        
        
        
        while (i < n1 && j < n2) {
 
            // If not common, print smaller
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
             
            }
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
               
                j++;
            }
            // Skip common element
            else {
                i++;
                j++;
            }
        }
        
        // printing remaining elements
        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
            
        }
        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
           
        }
    }

}
