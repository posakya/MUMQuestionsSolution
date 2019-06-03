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
public class sumDigit {
    
    public static void main (String [] args){
        System.out.println(sumDigits(3114));
    }
    
   static int sumDigits (int n){
        int sum =0;
        if(n==0){
            return sum;
        }
        while (n !=0){
            int rem = n % 10;
            sum +=rem;
            n /=10;
        }
        
        return sum;
    }
    
}
