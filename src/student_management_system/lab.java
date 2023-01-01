/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_management_system;
import java.util.*;
/**
 *
 * @author sdd
 */
public class lab {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t =1;
            int x= sc.nextInt();
            while(t<=x){
                int a=sc.nextInt();
                int b=sc.nextInt();
//                try{
//                    System.out.println(a*b);
//                }catch(ArithmeticException e){
//                    System.out.println("Exception Handled");
//                }
                try{
                    System.out.println(min(a/b,min(a-b,min(b+a,a*b))));
                }catch(ArithmeticException e){
                    System.out.println(min(a-b,min(b+a,a*b)));
                }
                t++;
              }
    }
    static int min(int a,int b){
        if(a<b)
            return a;
        return b;
    }
    
    
}
