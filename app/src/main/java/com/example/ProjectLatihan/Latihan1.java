/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class Latihan1 {
    
    public void nonStaticTest(){
        System.out.println("Non static method");
    }
    public static void staticTest(){
        System.out.println("static method");
    }
    // Hello world 
    public static void main(String[] args) {
        Latihan1 helloWorldObject = new Latihan1();
        //printing Hello World
        System.out.println("Hello World!!");
        //Non Static Method
        helloWorldObject.nonStaticTest();
        //Static Method
        staticTest();
        
    }
    
    
    
    
    
}
