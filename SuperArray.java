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
public class SuperArray {
    
    public static void main (String [] args){
        int[] a = {13, 5, 3, 2};
        System.out.println(isSuper(a));
    }
    
    static int isSuper(int[] a){
        int isSuper = 0;
        
        if(a[a.length-1]<a[a.length-2]){ 
            
        for(int i=a.length-3;i>=0;i--){
          
              if(a[i] > (a[i+1]+a[i+2])){
               
                isSuper = 1;
               
            }else{
                  break;
              }
            }
       
        }
        
        return isSuper;
    }
    
}
