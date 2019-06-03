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
public class sumIsPower {
    
    
    public static void main (String [] args){
        int [] a= {8,8,8};
        System.out.println(sumIsPower(a));
    }
    
    static boolean sumIsPower(int[] a){
        
        int power = 2; int sum = 0;
        
        for(int i=0;i<a.length;i++){
            sum +=a[i];
            power *= 2;
        }
        
    
        if(power == sum){
            return true;
        }
        
        return false;
    }
    
}
