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
public class isStacked {
    
    public static void main(String [] args){
        
        System.out.println(isStacked(15));
    }
     
      static int isStacked(int n){
          
          int isStacked = 0;
          int sum = 0;
          for(int i=0; i<=n; i++){
              
                sum += i;
          
          if(n == sum){
              isStacked =1;
              
           }
          }
          
          return isStacked;
      }
    
}
