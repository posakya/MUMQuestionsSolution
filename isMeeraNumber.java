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
public class isMeeraNumber {
    
    public static void main (String [] args){
        System.out.println(isMeera(30));
    }
    
    static int isMeera(int n){
        int count =0;
        int isMeera =0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
            
           
        }
         
        for(int j=2;j<n;j++){
            if(n%j==0){
                if(count == j){
                   
                    isMeera =1;
                    break;
                }
            }
        }
        
        
        return isMeera;
    }
    
}
