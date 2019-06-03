/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;


import java.util.Scanner;

/**
 *
 * @author lokesh
 */
public class CommonElementsFromArray {
    
    public static void main (String []args)
            
    {
        Scanner sc = new Scanner(System.in);
        
        int[] first = {1,5,3,2,4,6};
        int[] second = {3,2,1,1,4,6,7};
        
        f(first,second);
            
        
    }
    
    static int[] f(int[] first,int[] second){
        
        if (first == null || second == null) return null;
        
        if (first.length == 0 || second.length == 0) return new int[0];
        
        int[] first1 ;
        int[] second1 ;
        
        int min =(first.length < second.length) ? first.length : second.length;
        
        if(min == first.length){
            first1 = first;
            second1 = second;
        }else {
            first1 = second;
            second1 = first;
        }
        
        int[] c = new int[min];
        
        int k=0;
        
        
        for(int i=0; i<first1.length;i++)
            for(int j=0; j<second1.length;j++)
                if(first1[i] == second1[j]){
                    c[k] = first[i];
                    k++;
                }
        
                int size = c.length;
               
                  for(int i=0; i<size; i++){
                   for(int j=i+1;j<size; j++){
                 
                 if(c[i]==c[j]){
                     c[j] = c[size-1];
                     size --;
                    }
                }
             }
                  
                  for (int i=0; i<size; i++) {
                         for(int m=0;m<size;m++){
                             if(c[i]<c[m]){
                               int temp = c[i];
                               c[i] = c[m];
                               c[m] = temp;
                                 
                             }
                         }
                    }
                  
                
              for(int i=0; i<size; i++){
                 
               System.out.println(c[i]+" ");
                
             }

            System.out.println(size);
   
        return c;
    }
}
