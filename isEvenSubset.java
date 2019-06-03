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
public class isEvenSubset {
    
    public static void main (String [] args){
        System.out.println(isEvenSubset(18,12));
    }
    
  static int isEvenSubset(int m, int n){
        int isEvenSubSet = 1;
      for(int i=2;i<m;i++){
          if(i % 2 == 0 && m % i == 0 && n % i != 0){
             
              isEvenSubSet = 0;
              break;
          }
      }
      
      return isEvenSubSet;
    }
    
}
