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
public class isBeanArray {
    
    public static void main (String [] args){
        int[] a = {3, 6, 9, 5, 7, 13, 16, 17} ;
        System.out.println(isBean(a));
    }
       
    static int isBean(int[] a){
        int len = a.length;
       
        for(int i=0; i<len;i++){
               
            if(a[i] == 9){
                for(int k=0; k<len; k++){
                    if(a[k] == 13)
                    {
                        return 1;
                    }
                }
            }else if(a[i] == 7){
                for(int k=0; k<len; k++){
                    if(a[k] == 16)
                    {
                       return 0;
                    
                    }
                }
             
            }
              
       
        }
  
        return 1;
    }
}
