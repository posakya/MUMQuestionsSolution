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
public class isNormal {
    
    public static void main(String [] args){
        System.out.println(isNormal(9));
    }
    
    static int isNormal (int n){

        int j =2;
        
        for(;j<n;j++){
            if(n%j==0){
                if(j%2==1){
                    return 0;
                }
            }
        }
        
//        while(j<n){
//            if(n%j==0){        
//                if(j%2==1){
//                    return 0;
//                }
//            }
//            j++;
//        }
        
        return 1;
    }
    
}
