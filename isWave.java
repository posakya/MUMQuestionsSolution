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
public class isWave {
    
    public static void main (String [] args){
        int[] a = {5,4,3,12};
        System.out.println(isWave(a));
    }
    
   static int isWave (int [ ] a){
       int isWave = 1;
       
       for(int i=0;i<a.length-1;i++){
           
           if(a[i]%2==0){
               
               if((a[i+1] %2 ==0)){
                   
                   return 0;
                   
               }
        
           
           }else {
                if(a[i+1] %2 !=0){
               return 0;
           }
           }
        
           
           
         
       }
       
       return 1;
   }
    
}
