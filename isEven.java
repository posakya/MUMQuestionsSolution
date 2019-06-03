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
public class isEven {
    
    
    public static void main (String [] args){
        System.out.println(isEvens(2426));
    }
    
   static int isEvens (int n){
        int isEven = 1;
        while(n>0){
            int isValid = 0;
            int rem = n%10;
            if(rem%2 == 0){
                isValid = 1;
            }
            n = n/10;
            
            if(isValid == 0){
                isEven = 0;
            }
        }
        
        return isEven;
    }
    
}
