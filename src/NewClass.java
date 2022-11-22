/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sdd
 * */
abstract class bike{
    bike(){
        System.out.println("bike is created");
    }
    void changeGear(){
        System.out.println("Gear has been changed");
    }
    abstract void run();
}
class gixxer extends bike{

    void run() {
        System.out.println("running safely");
    } 
}
public class NewClass {
    void addition(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        bike ob=new gixxer();
        ob.run();
    }
}