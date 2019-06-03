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
public class ArrayOfAllPossibilites {
    
    public static void main(String [] args){
        int[] a = {1,2,0,3};
        System.out.println(isAllPossibilities(a));
    }
    
    static int isAllPossibilities(int[ ] a){
        
        int n = a.length-1;
        for(int i=0;i<a.length;i++){
            int isValid =0;
            for(int j=0;j<=n;j++){
                if(a[i] == j){
                    isValid = 1;
                }
            }
            
            if(isValid == 0){
               return 0;
            }
        }
        
        return 1;
    }
}
