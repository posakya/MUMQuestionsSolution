/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.Arrays;

/**
 *
 * @author lokesh
 */
public class IntersectionMultipleArray {
    public static void main(String[] args) {
    int[][] a = {
            { 10, 150,160, 200, 500, 500, },
            { 4, 150, 160, 170, 500, },
            { 2, 160, 150, 202, 203, },
            { 3, 150, 150, 160, 300 },
            { 3, 150, 160, 301, 300} };

    int n = a.length;
    int[] x = new int[n];

    for( ; x[0] < n; x[0]++ ) {
        int val = a[0][x[0]]; 
        boolean print = true;
        for( int i = 1; i < n; i++ ) {
            while (a[i][x[i]] < val && x[i] < n-1) x[i]++;              
            if (a[i][x[i]] != val) 
                print = false;  
            else {
                System.out.println(val);
            }
        }   
       
            
    }   
}
}
