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
public class isFancy {
    
    public static void main(String [] args){
        System.out.println(isFancy(17));
    }
    
    public static int isFancy(int n){
        
            int isFancy = 0;
            int a = 1, b = 1, c = 0;
            if (n == 1)
                return 1;
               
            while(c<n)
            {
                c = 3 * b + 2 * a;
                a = b;
                b = c;
            }
            if(c==n)
            {
                isFancy = 1;
            }
            
          return isFancy;
        }
}
