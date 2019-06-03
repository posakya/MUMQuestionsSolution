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
public class isNiceArray {
    
    public static void main (String [] args){
        int[] a = {4, 9, 8};
        System.out.println(isNice1(a));
    }
    
    static int isNice (int[] a){
        
        for(int i=0;i<a.length;i++){
            
            int isNice = 0;
            
            for(int j=0; j<a.length;j++){
                
                if(a[i] == (1+a[j]) || a[i] == (a[j]-1)){
                    
                    isNice = 1;
                   
//                    break;
                }
            }
            
            if(isNice == 0){
                return 0;
            }
        }
        
        return 1;
    }
    
       static int isNice1 (int[] a){
        
        for(int i=0;i<a.length;i++){
            
            int isNice = 0;
            
            for(int j=0; j<a.length;j++){
                
                if(a[i] == (2*a[j]) || a[i] == (2*a[j]+1) || a[i] == a[j]/2){
                    
                    isNice = 1;
                   
//                    break;
                }
            }
            
            if(isNice == 0){
                return 0;
            }
        }
        
        return 1;
    }
    
}
