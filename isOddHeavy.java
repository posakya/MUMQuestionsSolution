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
public class isOddHeavy {
    
    public static void main(String [] args){
        int[] a = {1,2};
        System.out.println(isOddHeavy(a));
    }
    
  static int isOddHeavy(int[] a){
      

      if(a.length==0){
          return 0;
      }
      
      if(a.length == 1 && a[0] %2 == 0){
          
          return 0;
         
      }
 
      
        for(int i=0; i<a.length; i++){
           
            if((a[i] %2 !=0)){
           
                for(int j=0; j<a.length; j++){
                    
                    if(a[j] %2 == 0){
                        
                         if(a[i] < a[j]){
                          
                           
                         return 0;
                          
                        }
                    }
                }
              
            }
           
        }
        
        return 1;
    }
    
}
