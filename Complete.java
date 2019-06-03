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
public class Complete {
    
    public static void main (String [] args){
//      int[] a =   {5, 7, 9, 13};
      int[] a= {3,5,3,3};
        System.out.println(isComplete1(a));
    }
    
    
  static  int isComplete (int[ ] a){
        
        int isComplete = 0;
      
        int min = a[0], max = a[0],val =0;
        
        for(int k=0;k<a.length;k++){
            if(a[k] %2 ==0){
                
                min = a[k];
                
            }
        }

        
        for(int i=0;i<a.length;i++){

            if(a[i]>0){
               
                if(a[i] %2 == 0){
                  
                if(min>a[i]){
                    min = a[i];
                     
                }
                if(max<a[i]){
                    max = a[i];
                }
               
            }
            }
            
        }
        
        val = max-min;
        
        if(val == 0){
            isComplete = 0;
        }else {
            
            for(int j=0;j<a.length;j++){
                for(int i=min;i<max;i++){
                    
                if(a[j] == i){
                  
                    isComplete = 1;
                }else {
                    isComplete = 0;
                  
                }
            }
        }
        }
        
        return isComplete;
    }
  
 static int isComplete1 (int[ ] a){
     int isComplete = 0;
     int max = a[0];
     
     for(int i=0; i<a.length;i++){
         if(a[i]>0){
             if(a[i] % 2 == 0){
                  if(max<a[i]){
                 max = a[i];
             }
             }
            
         }else {
             isComplete = 0;
             break;
         }
     }
     System.out.println("Max : "+max);
     
     for(int k=1; k<max;k++){
         for(int j=0;j<a.length;j++){
             if(a[j]>0)
             if(a[j] %2 == 0 && k %2 == 0){
                 if(a[j] == k){
                     isComplete = 1;
                 }else {
                    isComplete = 0;
                  
                }
             }
         }
     }
     
     return isComplete;
 }
}
