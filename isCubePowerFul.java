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
public class isCubePowerFul {
    
    public static void main(String [] args){
        int a = 153;
        System.out.println(isCubePowerFul(a));
    }
    
     static int isCubePowerFul(int n){
        int sum=0,rem,temp,cube,isCubePowerFul=0;
        
        temp =n;
        
       while (n>0){
           
           rem = (n%10);
           cube = rem*rem*rem;
           sum += cube;
           n = n/10;
           
       }
       if(sum == temp){
           isCubePowerFul = 1;
       }
        
        return isCubePowerFul;
    }
}
