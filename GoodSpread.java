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
public class GoodSpread {
    
    public static void main(String []args){
        int[ ] a = {3, 1, 3 ,1, 3,5, 5, 5};
        System.out.println(goodSpread(a));
    }
    
   static int goodSpread(int[] a){
        
         
        for(int i=0; i<a.length;i++){
           int count =0;
            for(int j=1;j<a.length; j++){
                
                if(a[j]==a[i]){
                    
                    count++;  
                   
                }
            } 
            if(count > 3){
                      
                       return 0;
                       
                    }
       
        }
        
        return 1;
    }
    
}
