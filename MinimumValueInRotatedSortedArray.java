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
public class MinimumValueInRotatedSortedArray {
     public static void main(String[] args) {
        int[] a = { 4, 5 ,6, 7, 0, 1 ,2};
        System.out.println("Min : "+findMin(a));
    }

    public static int findMin(int[] a) {

        int min = a[a.length - 1];
        System.out.println("val : "+min);
        System.out.println(a.length-1);

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                break;
            }
        }
        
        return min;
    }
}
