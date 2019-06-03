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
public class BalancedArray {
    public static void main(String args[]) {
        int [] a = {4,-3, 3, -4};
        System.out.println(isBalanced(a));
}

public static int isBalanced(int[] a) {
   
    for (int i = 0; i < a.length; i++) {
         int status = 0;
        for(int j = 0; j < a.length; j++) {
            if(a[i] + a[j] == 0) {
                status = 1;
                break;
            }

        }
        
        if(status == 0) {
           return 0;
        }

    }

    return 1;
}

}
