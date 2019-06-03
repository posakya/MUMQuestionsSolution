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
public class hasKSmallFactors {
    
    public static void main (String []args){
        System.out.println(hasKSmallFactors(12,22));
    }
    
    public static boolean hasKSmallFactors(int k,int n){
        boolean hasKSmallFactors = false;
        
        if(n<0 || k<0)
            hasKSmallFactors = false;
        
        for(int i=2; i<k; i++){
            for(int j=2;j<k;j++){
                if(i<k && j<k){
                    if(i*j == n){
                        hasKSmallFactors = true;
                        break;
                    }
                }
            }
        }
        
        return hasKSmallFactors;
    }
    
}
