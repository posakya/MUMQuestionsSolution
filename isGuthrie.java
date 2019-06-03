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
public class isGuthrie {
    
    public static void main(String [] args){
        int result = isGuthrieSequence(new int[] {8, 4, 2, 1});
		System.out.println(result);
    }
    
    static int isGuthrieSequence(int[] a){
        
        int isGuthrie = 0;
        
        int nextGuthrieSequenceNumber = a[0];
        if(a[a.length-1] ==1)
        for(int i=0; i<a.length; i++){
            if(a[i] == nextGuthrieSequenceNumber){
                isGuthrie = 1;
            if(a[i] % 2 ==0){
               nextGuthrieSequenceNumber = a[i]/2;
            }else {
                nextGuthrieSequenceNumber = a[i]*3+1;
            }
            } else {
                    isGuthrie = 0;
                    break;
                    }
            
        }
        
        
        return isGuthrie;
    }
}
