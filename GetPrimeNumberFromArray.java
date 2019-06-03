/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampledatastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lokesh
 */
public class GetPrimeNumberFromArray {
    
    public static void main (String []args){
        
        primeCount(10,20);
        //f(29);
//        int[] a = {1,2,3,4,5,6,7,8};
//        arrayPrime(a);

//            String[] a = {"8","1","3","3","4"};
//            String[] b = {"8","1","2","4","5","6","7"};
//            String[] c = {"8","1","10","2","3","9","6","7"};
//            countMatch(a,b,c);

//        String[] inputArray1 = {"2","8", "3", "4", "7", "1"};
//         
////        String[] inputArray2 = {"4","8", "1", "3", "5"};
////         
//        String[] inputArray3 = {"8", "4", "6", "2", "1"};
//         
//        String[] inputArray4 = {"7","8", "9", "4", "1"};
//         
//        union(inputArray1,inputArray3, inputArray4);
//       
//       String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
//  
//        for (int i = 0; i < strArray.length; i++)
//        {
//            for (int j = 0; j < strArray.length; j++)
//            {
//                if( (strArray[i].equals(strArray[j])) && (i != j) )
//                {
//                    System.out.println("Duplicate Element is : "+strArray[j]);
//                }
//            }
//        }
            
    }
    
    //// checking whether the given number is prime or not ////
    static int f(int n){
        
       // int n1 = n/2;
       int flag = 0;
       
        for(int i=2;i<=n/2; i++){
            if(n%i==0){
                flag =1;
            }
        }
        
        if(flag ==0){
            System.out.println("Prime number");
        }else {
            System.out.println("Not a prime number");
        }
        
        return flag;
    }
    
    ///// getting the array of prime number ///
    
    public static void arrayPrime(int[] n){
        
        List<Integer> primeNumber = new ArrayList();
        List<Integer> nonPrime = new ArrayList();
        
        //int[] prime;
        int[] nonPrimeNumber = null ;
        
        for(int i=2; i<n.length; i++){
            if(n[i]%2==0){
                nonPrime.add(n[i]);
            }else{
                primeNumber.add(n[i]);
            }
        }
       
        //// converting list to array ////
        int [] prime = primeNumber.stream().mapToInt(Integer::intValue).toArray();
       
        System.out.println("Prime Number : "+Arrays.toString(prime));
        System.out.println("Non prime number : "+nonPrime);
        
    }
    
    ////// get common element from two array ////
    public static int countMatch(String[] a, String[] b, String[] c) {
    
        List<String> list1 = new ArrayList(Arrays.asList(a));
        
        List<String> list2 = new ArrayList(Arrays.asList(b));
        
        List<String> list3 = new ArrayList(Arrays.asList(c));
        
        List<String> unionList1 = new ArrayList();
        
        //// merging list data ///
       
        unionList1.addAll(list1);
        unionList1.addAll(list2);
        unionList1.addAll(list3);
   
        Set<String> filterList2 = new HashSet<>(unionList1);
        
        System.out.println("\nFilter union list : "+filterList2);
        System.out.println("\nFilter Union list Size : "+filterList2.size());
        
        list2.retainAll(list3);
        list1.retainAll(list2);
        
        Set<String> filterList = new HashSet<>(list1);
        
        System.out.println("\n\nUnion : "+unionList1);
        System.out.println("\n\nUnion Size : "+unionList1.size());
        
        System.out.println("\n\n\nIntersection : "+list1);
        System.out.println("Intersection List size : "+list1.size());
        
        System.out.println("Intersection Filtered List : "+filterList);
        System.out.println("Filter list Size : "+filterList.size());
       
       
        return list1.size();
    }
    
     static void union(String[] ... arrays)
    {
        
       int l =0;
       
       int count =0;
       
       String[] c = null;
       
        for(String[] array : arrays){  
             l +=array.length;
             
              c = new String[l];
              
              for(int i =0; i<array.length;i++){
                  c[i] = array[i];
                  
              }  
        }
        
      System.out.println(Arrays.toString(c));
        
//        Set<String> unionSet = new HashSet<>();
//        Set<String> intersectionSet = new HashSet<>(Arrays.asList(arrays[0]));
       
        
//        String[] c = new String[arrays.length];
       
       
       
     
//        for (String[] inputArray : arrays) 
//        {
//           
//            for(String[] array : arrays){
//                HashSet<String> set = new HashSet<>(Arrays.asList(array));
//                intersectionSet.retainAll(set);
//            }
//  
//            unionSet.addAll(Arrays.asList(inputArray));
//            
//           
//        }
//         
//        System.out.println("Union Of All Input Arrays : "+unionSet);
//          
//        System.out.println("===========================");
//         
//        System.out.println("Intersection Of All Input Arrays : "+intersectionSet);
//       
    }
     
     static int primeCount(int start, int end){
         
         String result ="";
         for(int i=start; i<=end;i++){
             for(int j=2; j<=i; i++){
                 if(i%j !=0){
                     result +=i;
                 }
             }
         }
         System.out.println(result);
         return Integer.parseInt(result);
     }
     
  
}
