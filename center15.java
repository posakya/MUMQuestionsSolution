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
public class center15 {
    
    public static void main(String [] args){
        int [] a={9, 15, 6};
        System.out.println(isCenter15(a));
    }
    
    static int isCenter15(int [] a){
       int length = a.length;
        if(length == 0){
            return 0;
           
        }
        
        if(length==3 && a[1] ==15){
            return 1;
        }
        
        int x=1;
        while (x != length-2){
            int sum=0;
            for(int i=x;i<length-1;i++){
                sum +=a[i];
                
                if(sum == 15){
                    if(length-i-1 == x){
                        return 1;
                    }
                }
            }
        x++;
        }
        return 0;
    }
    
    
}
