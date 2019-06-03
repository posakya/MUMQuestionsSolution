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
public class Is121Array {
	public static void main(String []args)
	{
		int a[]={1,1,2,1,2,1,1};
		
		System.out.println(is121Array(a));
	}


        
        public static int is121Array(int[] a)
         {
		 
		 int i,j,k, t1 = 0, t2 = 0, t3=0;
                
                 
                 if(a[0] != 1){
                     return 0;
                 }
                 
                 for(i=0;i<a.length; i++){
                     if(a[i]==1){
                         
                         t1++;
                         
                     }else{
                         break;
                     }
                 }
                 
                 for(j=i;j<a.length;j++){
                     if(a[j] == 2){
                         t2++;
                     }else{
                         break;
                     }
                 }
                 
                 for(k=j;k<a.length;k++){
                     if(a[k]==1){
                         t3++;
                     }else{
                         break;
                     }
                 }
                 
                 System.out.println("t1 : "+t1);
                 System.out.println("t3 : "+t3);
                 
                 if(t1!=t3){
                     return 0;
                 }
                 
                 return 1;
                 
         }
        
//         public static int is121Array(int[] a)
//        {
//            int is121 = 1;
//            int fristonecount = 0, secondonecount = 0, twocount = 0;
//            int prevelement = 0;
//            int changecount = 0;
//            int firstelement = a[0];
//            
//            if (firstelement != 1) 
//                is121 = 0;
//            
//            for (int i = 0; i < a.length && is121 == 1; i++)
//            {
//                
//                if (a[i] == 2)
//                    twocount++;
//
//                if (prevelement != a[i])
//                    changecount++;
//
//                if (changecount == 1)
//                    if (a[i] == 1)
//                        fristonecount++;
//                if (changecount == 3)
//                    if (a[i] == 1)
//                        secondonecount++;
//                if (changecount > 3)
//                    is121 = 0;
//
//                prevelement = a[i];
//            }
//            if (twocount < 1)
//                is121 = 0;
//            
//            if (fristonecount != secondonecount)
//                is121 = 0;
//            return is121;
//
//        }
}
