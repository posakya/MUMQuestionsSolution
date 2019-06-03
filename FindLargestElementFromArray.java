/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lokesh
 */
public class FindLargestElementFromArray {
    
    public static void main (String []args){
        
        largestAndSmallest(new Integer[]{-20, 34, 21, -87, 92,
                             10,100,-120});
        
    }
    
    public static void largestAndSmallest(Integer[] numbers) 
    { 
        int largest = 0;
        int smallest = 0;
        int temp = 0;
        
        /*
        //// simple using builtin function for sorting array in ascending order ////
        Arrays.sort(numbers);
        System.out.println("In asscending order : " + Arrays.toString(numbers));
        
       //// simple using builtin function for sorting array in descending order ////
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("In descending order : " + Arrays.toString(numbers));

       */

        for(int i=0; i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                
                //// for ascending orders /// 
//                if(numbers[i] < numbers[j]){
//                    temp = numbers[i];
//                    numbers[i]=numbers[j];
//                    numbers[j]=temp;
//                    
//                }

//                largest = numbers[j];
//                smallest = numbers[0];
                
                 //// for descending orders /// 
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;        
                } 
                
                largest = numbers[1];
                smallest = numbers[numbers.length-2];
            }
        }
        
        System.out.println("Given integer array : " + Arrays.toString(numbers));        
        System.out.println("Largest number in array is : " + largest); 
        System.out.println("Smallest number in array is : " + smallest);

    }
}
