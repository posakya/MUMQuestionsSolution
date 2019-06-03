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
public class isMeeraArray {
    
    public static void main(String []args){
        int [] a= {4, 8, 3, 2, 9, 8,11, 8, 13, 12, 12, 6};
        System.out.println(isMeera(a));
    }
    
//    static int isMeera(int[] a){
//        
//       for(int i =0;i<a.length;i++){
//           if(a[i]==1){
//               for(int j=0;j<a.length;j++){
//                  if(a[j]==9){
//                      return 1;
//                  } 
//               }
//           }
//       }
//            
//         
//        return 0;
//    }
    
    public static int isMeera(int [] a){
boolean hasOdd = false;
int firstEven = 0;
int lastEven = 0;
boolean firstCountEnd = false;
boolean lastCountEnd = false;
for(int i = 0; i<a.length; i++){
    if (a[i]%2 == 1)
            {
                hasOdd = true;
                break;
            }
}
if (!hasOdd)
    return 0;

for (int j = 0; j<a.length; j++){
    if(a[j]%2==1)
        firstCountEnd=true;
    if(!firstCountEnd && a[j]%2==0)
        firstEven++;
    if(a[(a.length-1)-j]%2==1)
        lastCountEnd=true;
    if(!lastCountEnd && a[(a.length-1)-j]%2==0)
        lastEven++;
}
//System.out.println(firstEven +" " +lastEven);
if (hasOdd && firstEven == lastEven)

    return 1;
return 0;
} 
    
}
