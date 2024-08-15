/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Vehicle1{
    void run3()
    {
        System.out.println("Vehicle is the parent class");
    }
}
class Bike1 extends Vehicle1{
    void run2()
    {
        System.out.println("Bike has some property of a vehicle");
    }
}
class Cycle extends Bike1{
    void run1()
    {
        System.out.println("Cycle has some property of a Bike");
    }
}
public class LatihanMultilevelInheritance {
    public static void main(String[] args) {
        Cycle c= new Cycle();
        c.run1();
        c.run2();
        c.run3(); 
    }
}
