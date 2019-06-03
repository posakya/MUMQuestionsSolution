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
public class isSym {
    
    public static void main(String [] args){
        int[] a=  {2, 7, 8, 9, 11, 13, 10};
        System.out.println(isSym(a));
    }
    
    public static int isSym (int [ ] a)
        {
            int rtnVal = 0;
            if(a.length>=1)
            {
               for (int i = 0, j = a.length - 1 ; i < j; i++, j--)
                   
                {
                    //cheking odd or Even
                    if ((a[i] % 2 == 0 && a[j] % 2 == 0) || (a[i] % 2 != 0 && a[j] % 2 != 0))//
                    {
                        rtnVal = 1;
                    }
                    else
                    {
                        rtnVal = 0;
                        break;
                    }

                }
            }
           
            return rtnVal;
        }
    
}
