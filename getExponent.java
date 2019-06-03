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
public class getExponent {
    
    public static void main(String [] args){
        System.out.println(getExponent(280,7));
    }
    
    static int getExponent(int n,int p){
        if(p<=1){
            return -1;
        }
        
        int count =0;
        while (n%p ==0){
            count++;
            n /= p;
        }
        
        return count;
    }
}
