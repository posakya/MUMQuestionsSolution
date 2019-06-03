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
public class DateDifference {
    
    public static void main(String[] args){
        System.out.println(leapYear(2020));
    }
    
 public static int leapYear(int year){
//     
//     if(year % 4 !=0 || year % 100==0 && year % 400 !=0){
//         return 0;
//     }else {
//         return 1;
//     }
// 
 if((year %4 != 0 || year %100 == 0 ) && year % 400 !=0 ){
     return 0;
 }
//// 
return 1;
 }
}
