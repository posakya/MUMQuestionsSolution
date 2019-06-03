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
public class isEvenSpaced {
    
    public static void main (String [] args){
        int[] a = {200, 10, 151, 160};
        System.out.println(isEvenSpaced(a));
    }
    
    static int isEvenSpaced(int[] a){
        int isEvenSpaced = 0;
        
        int max = a[0];
        int min = a[0];
        
        for(int i=0; i<a.length;i++){
            if(max < a[i]){
                max = a[i];
            }
            
            if(min > a[i]){
                min = a[i];
            }
        }
        
        if((max - min) %2 ==0 ){
            isEvenSpaced = 1;
        }
        
        return isEvenSpaced;
    }
    
}
