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
public class minDistance {
    
  public static void main (String []args){
      System.out.println(maxDistance(25));
  }
    
  public static int maxDistance(int n)
        {
            int minDist = n, count = 0, f1 = 0;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    if (count == 0){
                          f1 = i;
                    }
                      
                    count++;
                    if (count > 1)
                    {
                        if (minDist > i - f1)
                            minDist = i - f1;
                        f1=i;
                        
                    }

                }
                
                if (count == 1 && i == n - 1)
                    minDist = i - i;
            }
            if (count == 0)
            {
                return -1;
            }
            return minDist;

        }
public static int minDistance(int num){
        int fact1 = 1;
        int minDist = num;
        int count =0;
        
        for(int i=2; i<num; i++){
            if (num%i==0){
                
                if (count == 0){
                    fact1=i;
                }
                count++;
                
                if(count>1)
                
                if((i-fact1)<=minDist){
                    minDist = i-fact1;
                    fact1 = i;                   
                }           
            }
            
            if (count == 1 && i == num - 1)
                    minDist = i - i;
        }
    return (minDist);
} 
 
}
