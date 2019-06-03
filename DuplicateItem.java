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
public class DuplicateItem {
    public static void main (String []args){
        int[] a = {1,1,1,8,2,9,9,7,8};
       // duplicateItem(a);
       // NonduplicateItem(a);
       // FirstNonduplicateItem(a);
       // FirstduplicateItem(a);
       // LastduplicateItem(a);
        LastNonduplicateItem(a);
    }
    
    /// Array of duplicate Item ///
    static void duplicateItem(int[] a){
        
        /*
        You can sort the array before you compare
        */
     
        int temp =0;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
     
      
        int count=0;
        int dupSize =0;
        int n = a.length;
        for(int j=0;j<a.length;j++) {
            //int k;
            for(int k = j+1; k<a.length;k++) {
                
                if(a[j] == a[k]) {
                  
                    count++;
                }
                
            }
          
               
            if(count==1){
                dupSize++;
                System.out.println(a[j]);
                //break;
               
            }
                 
          count = 0;
        }
        
          
      System.out.println("Count : "+dupSize);
    }
    
    //// Array of non duplicate item ///
    static void NonduplicateItem(int[] a){
        
        /*
        You can sort the array before you compare
        */
     
        int temp =0;
        int [] rep = new int[a.length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      
        
        int count=0;
        
        int n = a.length;
        
        int dupSize =0;
        
        for(int j=0;j<a.length;j++) {
            
            for(int k = 0; k<a.length;k++) {
                
                if(a[j] == a[k]) {
                    
                    count++;
                }
                
            }
          
               
            if(count==1){
                
                dupSize++;
                rep[dupSize] = a[j];
                System.out.println(a[j]);
                
               
            }
       
            count = 0;
        }

        int[] retArray = new int[dupSize];     
        for (int i = 0; i < retArray.length; i++)
        retArray[i] = rep[i+1];
        
        System.out.println("Last Element : "+retArray[retArray.length-1]);
        
        System.out.println("Count : "+dupSize);
    }
    
    //// first non - repeating element //
    static void FirstNonduplicateItem(int[] a){
        
        /*
        You can sort the array before you compare
        */
     
        int temp =0;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      
        int count=0;
       
        for(int j=0;j<a.length;j++) {
            //int k;
            for(int k = 0; k<a.length;k++) {
                
                if(a[j] == a[k]) {
                  
                    count++;
                }
                
            }
          
               
            if(count==1){
                
                System.out.println(a[j]);
                break;
               
            }
                 
          count = 0;
        }
     
    }
    
    ////// first repeating element ////
    static void FirstduplicateItem(int[] a){
        
        /*
        You can sort the array before you compare
        */
     
        int temp =0;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      
        int count=0;
       
        for(int j=0;j<a.length;j++) {
            //int k;
            for(int k = j+1; k<a.length;k++) {
                
                if(a[j] == a[k]) {
                  
                    count++;
                }
                
            }
          
               
            if(count==1){
                
                System.out.println(a[j]);
                break;
               
            }
                 
          count = 0;
        }
     
    }
    
    ///// last repeating element ////
    static void LastduplicateItem(int[] a){
        
        /*
        You can sort the array before you compare
        */
     
        int temp =0;
        int[] rep = new int[a.length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      
       
        int n = a.length;
       System.out.println(Arrays.toString(a));
       
         for (int i = n - 1; i > 0; i--) 
        {
            if (a[i] == a[i - 1]) 
            {
            
            System.out.println("Last duplicate item: "
                              + a[i]);
            return;
            }
        }
          
    }
    
    ///// last non - repeating element ////
    static void LastNonduplicateItem(int[] a){
        
        /*
        You can sort the array before you compare
        */
     
        int temp =0;
//        
//        int[] rep = new int[a.length];
        int n = a.length;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                }
            }
        }
       
        System.out.println(Arrays.toString(a));
        
     
       
         for (int i = n - 1; i > 0; i--) 
        {
            
            if (a[i] != a[i - 1]) 
            {
            
            System.out.println("Last non-duplicate item: "
                              + a[i]);
            return;
            }
        }
          
    }
    
}
