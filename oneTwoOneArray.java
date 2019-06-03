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
public class oneTwoOneArray {
    public static void main (String [] args){
        int[] a = {1, 1,1, 2,2, 1,1, 1};
        System.out.println(is121Array(a));
               
    }
    
    static int is121Array(int[ ] a){
        
//        int is121Array = 1;
        int onesCount = 0;
        int secondCount = 0;
        int lastOnesCount =0;
        
        if(a.length==0){
            return 0;
        }
      
        if(a[0] != 1 || a[a.length-1] !=1){
            return 0;         
        }
     
        
        int i,j,k;
       
        
        for(i=0; i<a.length;i++)
        {
            if(a[i] == 1){
                
                onesCount++;
              
            }else{
                break;
            }
        }
         
        for(j=i; j<a.length;j++)
        {
            if(a[j] == 2){
                secondCount++;
                
            }else{
                break;
            }
        }
        
           
        if(secondCount==0){
            return 0;
        }
        
        for(k=a.length-1;k>=j;k--){
            if(a[k]==1){
                lastOnesCount++;
               
            }else{
                break;
            }
        }
        
   
        
        System.out.println("One : "+onesCount);
        System.out.println("Two : "+lastOnesCount);
        if(onesCount!=lastOnesCount)
        {
             return 0;
               
        }
     
      
      
        
        
        
        return 1;
        
    }
}
