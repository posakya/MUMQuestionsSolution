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
public class factorTwoCount {
    
    public static void main(String [] args){
        System.out.println(factorTwoCount(1));
    }
    
    static int factorTwoCount(int n){
        
        int  count = 0;
        
        
        while(n %2 == 0){
            
            count ++;
            n /=2;
           
        }
        
        return count;
    }
    
}
