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
public class PascalNumber {
    
    public static void main (String []args){
        System.out.println(isPascal(10));
    }
    
    
    static int isPascal(int n){
        int c=0,j=0;
        while(c<n){
            c +=j;
            j++;
        }
        
        if(c==n){
            return 1;
        }
        return 0;
    }
    
}
