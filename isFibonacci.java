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
public class isFibonacci {
    
    public static void main (String [] args){
        System.out.println(isFibonacci(5));
    }
    
     static int isFibonacci (int n){
        
        int isFibonacci = 0;
        
        
        
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        
        if(n==1){
            isFibonacci =1;
        }
        
//         for(int i=2; i<=n; ++i){
//             
//             n3 = n1 + n2;
//             n1=n2;
//             n2=n3;
//             
//             if(n3==n){
//                 isFibonacci = 1;
//             }
//             
//        }

        while(n3<n){
            n3 = n1+n2;
            n1=n2;
            n2=n3; 
            System.out.println("n3 "+n3);
        }
        
         if(n3==n){
                 isFibonacci = 1;
             }
        
        return isFibonacci;
        
    } 
}
