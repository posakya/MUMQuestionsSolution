/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.ArrayList;
import java.util.List;
import static sampledatastructure.FindMissingElement.missingValue;

/**
 *
 * @author lokesh
 */
public class FindMissingArrayElement {
    
    public static void main (String []args){
        
         int[] a = {6,7,8,10};
        missingValue(a,10);
    }
    
     static int missingValue(int[] a,int totalCount){
        
        List<Integer> original = new ArrayList();
        
        for(int i : a){

            original.add(i);
             
        }
        
        System.out.println("Original Array : "+original);
         
         
        List<Integer> numbers = new ArrayList();
        List<Integer> missingValue =  new ArrayList();
        
        for(int j=0; j<=totalCount;j++){
            numbers.add(j);
        }
        
        System.out.println("Require Array : "+numbers);
          
        for(int i=0;i<=totalCount; i++){
            for(int k=0;k<a.length;k++){
                if(a[k]==numbers.get(i)){
                   
                    missingValue.add(a[k]);
                    
                }
            }
        }
        
        numbers.removeAll(missingValue);
        
       
        System.out.println("Missing numbers : "+numbers);
      

        
        return totalCount;
    }
    
}
