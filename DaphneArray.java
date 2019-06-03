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
public class DaphneArray {
    
    public static void main(String []args){
        int[] a =  {4, 8, 6, 3,2,3,4,5,7,12,12,6} ;
        System.out.println(isDaphne(a));
    }
    
    static int isDaphne(int[] a){
        
        int eCnt1 =0, eCnt2=0,oCnt = 0;
        int i,j,m,k;
        
        for(i=0; i<a.length;i++){
            if(a[i] %2 == 0){
                eCnt1++;
            }else
                break;
        }
         for(j=i; j<a.length;j++){
            if(a[j] %2 != 0){
                oCnt++;
            }else{
                break;
            }
        }
         if(oCnt<1){
              return 0;
         }
         System.out.println(j);
         for( k=a.length-1; k>=j;k--){
             if(a[k] %2 == 0){
                 eCnt2++;
             }else
                break;
         }
         
         if(eCnt1 != eCnt2){
             return 0;
         }
         
        
        return 1;
    }
    
}
