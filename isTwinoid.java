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
public class isTwinoid {
    
    
    public static void main(String [] args){
        int[] a = { 3,3,4,6, 3};
        System.out.println(isTwinoid(a));
    }
    
    public static int isTwinoid(int[] a){
        
        int isTwinoid = 0;
        int count =0;
        
        for(int i=0; i<a.length;i++){
             
            if(a[i] %2==0){

              count++;
            }
          
        }
        
           if(count==2){
            
                for(int j=0;j<a.length-1;j++){
                    if(a[j]%2==0 && a[j+1]%2==0){
                        isTwinoid =1;
                    }
                }
            }
        
         
        return isTwinoid;
    }
    
}
