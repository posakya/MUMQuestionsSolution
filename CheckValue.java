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
public class CheckValue {
    
    public static void main (String []args){
        int x =1;
        int y=1;
        int z=0;
        
        if(!(x++>1 || y++>1)){
            
            
            z=x+y;
        }
        System.out.println(z);
    }
    
}
