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
public class repsEqual {
    
    public static void main (String [] args){
        int [] a ={4,2,0,5,3};
        int n= 32053;
        System.out.println(repsEqual(a,n));
    }
    
    
   static int repsEqual(int[] a, int n){
		int repsEqual = 0;
		for(int lastIndex = a.length - 1; lastIndex >= 0 ; lastIndex--){
			int lastDigit  = n % 10;
			n = n / 10;
			if(lastDigit == a[lastIndex]){
				repsEqual = 1;
			}else{
				repsEqual = 0;
				break;
			}
		}
		return repsEqual;
	}
    
}
