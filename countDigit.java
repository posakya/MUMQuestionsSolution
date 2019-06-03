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
public class countDigit {
    
    public static void main (String []args){
        System.out.println(countDigit(33331, 3));
    }
    
    static int countDigit(int n,int digit){
        int count =0;
    if(n <0 || digit < 0)
         return -1;
   
    while( n != 0){
        int rem = n%10;
        if(rem ==  digit)
            count++;
        
        n /=10;
    }
        
    return count;
}
}
