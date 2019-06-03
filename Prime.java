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
class Prime {

    boolean IsPrime(int i) {
        boolean IsPrime = true;
        for(int n=2; n<i; n++){
            
            if(i%n !=0 ){
                
                IsPrime = false;
            }
            
            System.out.println(i);
        }
        
        return IsPrime;
    }
    
}
