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
public class CountMax {
    
    public static void main(String [] args){
        int [] a= { 3, 1, 3, 4, 3, 5,5,5};
        System.out.println(countMax(a));
    }
    
    
    static int countMax(int[] a){
        int countMax = 0;
        int max = a[0];
        
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }      
        }
        
        for(int j=0;j<a.length;j++){
             
            if(max == a[j]){
                
                countMax++;
             }
            }
         
        
        return countMax;
    }
    
}
