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
public class isMaxMinEqual {
    
    public static void main (String [] args){
        int[] a ={1, 1, 2, 2, 1, 2};
        System.out.println(isMaxMinEqual(a));
    }
    
    static int isMaxMinEqual(int [] a){
        int isMaxMinEqual = 0;
        if(a.length==0){
            return 0;
        }
        
        
        int max = a[0];
        int min = a[0];
        int maxCnt=0;
        int minCnt=0;
        
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
            
        }
        
        if(max == min){
            return 0;
        }else{
        
          for(int j=0;j<a.length;j++){
            if(max == a[j]){
                maxCnt++;
            }
            
            if(min == a[j]){
                minCnt++;
            }
        }
          
        if(maxCnt==minCnt){
           return 1;
        }
        
        
        } 
       
        return 0;
    }
}
