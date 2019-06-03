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
public class isHollow {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
          //  yes
 int a1[] = {1,2,0,0,0,3,4,0}; //  yes 2 non-zeros precede and follow 3 zeros in the middle
 int a2[] = {1,1,1,1,0,0,0,0,0,2,1,2,18,0};// yes 4 non-zeros precede and follow the 5 zeros in the middle
 int a3[] = {1, 2, 0, 0, 3, 4}; // no There are only 2 zeroes in the middle; at least 3 are required
 int a4[] = {1,2,0,0,0,3,4,5}; // no The number of preceding non-zeros(2) is not equal to the number of following non-zeros(3)
 int a5[] = {3,8,3,0,0,0,3,3}; // no The number of preceding non-zeros(3) is not equal to the number of following non-zeros(2)
 int a6[] = {1,2,0,0,0,3,4,0}; // no Not all zeros are in the middle
 int a7[] = {0,1,2,0,0,0,3,4}; // no Not all zeros are in the middle
 int a8[] = {0,0,0} ; //  yes 
  
 if(IsHollow(a1))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }

//  
 if(IsHollow(a2))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
  
 if(IsHollow(a3))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
  
 if(IsHollow(a4))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
  
 if(IsHollow(a5))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
  
 if(IsHollow(a6))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
  
 if(IsHollow(a7))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
  
 if(IsHollow(a8))
 {
 System.out.print("\nyes");
 }else
 {
 System.out.print("\nno");
 }
            
    }
    
    static public boolean IsHollow(int [] a)
    {
        int i, j, k, m ,len = a.length;
        
        int NumCnt1 = 0, NumCnt2 = 0, ZeroCnt = 0;
         
        for (i =0 ; i < len ;i++)
        {
            if(a[i] > 0)
            {
                
               NumCnt1++;
            }
            else
                break;
            
        }
//        System.out.println("\nI "+i);
        for (j =i ; j < len ;j++)
        {
            if(a[j] == 0)
            {
               
               ZeroCnt++;
            }
            else 
                break;
        }
     
        if (ZeroCnt < 3)
            return false;
        
        for (k =len-1 ; k >=j ;k--)
        {
            if(a[k] > 0)
            {
                 
                NumCnt2++;
            }
            else 
                break;
        }
////        System.out.println("K "+k);
//        for ( m = k ;  m < len ;m++)
//        {
//            if(a[m] == 0)
//            {
//                return false;
//            }
//        }
            
        if (NumCnt1 == NumCnt2)  
            return true;
            
        return false ;
    }
     
    
}
