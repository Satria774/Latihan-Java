// Latihan Access modifier, non-Acces Modifier, variable
package com.example.ProjectLatihan;

public class Latihan1 {
    
    //instance variable
    Integer instanceVariable=10;
    static Integer staticVariable=30;
    
    // non static, private modifier and synchronized
    private synchronized void nonStaticTest(){
        //local variable
        Integer localVariable=20;
        System.out.println("Non static method");
    }
    //static, public modifier
    public static void staticTest(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        //penggunaan variable instance
        Latihan1 helloWorldObject1 = new Latihan1();
        helloWorldObject1.instanceVariable=20;
        Latihan1 helloWorldObject2 = new Latihan1();
        helloWorldObject2.instanceVariable=40;
        
        //penggunaan variable static
        Latihan1.staticVariable=100;
        
        //printing Hello World
        System.out.println("Hello World!!");
        //Non Static Method
        Latihan1 helloWorldObject = new Latihan1();
        helloWorldObject.nonStaticTest();
        //Static Method
        staticTest();
        
    }
    
    
    
    
    
}
