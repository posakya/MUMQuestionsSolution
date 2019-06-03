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
public class isBunkerNumber {
    
    public static void main (String [] args){
        System.out.println(isBunker(22));
    }
    
    public static int isBunker(int n)
        {
            int a = 0, b = 1, c = 0,j=0;
            while(c<n)
            {
                c = a + b;
                a = j;
                b = c;
                j++;
                
                System.out.println(c);
       
            }
            if (c == n)
                return 1;
            else
                return 0;
        }
    
}
