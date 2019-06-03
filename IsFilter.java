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
public class IsFilter {
    
    public static void main (String [] args){
        int [] a ={4} ;
        System.out.println(isFilter(a));
    }
    
    static int isFilter (int[] a){
        int isFilter = 0;
        int isFound9 =0, isFound11=0,isFound7=0;
        int isFound13=0;
        
        
        for(int i=0;i<a.length;i++){
           
            if(a[i] == 9){
                isFound9=1;
               
            }
            
            if(a[i]==11){
                isFound11=1;
             }
                
           
             if(a[i]==7){
                     isFound7=1;
                     
             }
                  
              if(a[i] == 13){
                       isFound13=1;
                      
                }
             
         
        }
        
        if(isFound9 == 1 && isFound11 ==1){
            isFilter = 1;
        }
        if(isFound7 == 1 && isFound13 == 0){
            isFilter = 1;
        }
        
        if(isFound7==0 && isFound13==1){
            isFilter=1;
        }
        

        
        return isFilter;
    }
    
}
