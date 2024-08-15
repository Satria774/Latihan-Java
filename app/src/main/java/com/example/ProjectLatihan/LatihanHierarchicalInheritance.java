/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Vehicle3{
    void move(){
        System.out.println("Vehicle is moving");
    }
}

class Bikes extends Vehicle3{
    void changeGear(){
        System.out.println("Bike has 2 wheels");
    }
}

class Cars extends Vehicle3{
    void run(){
        System.out.println("Bike has 4 wheels, so it can get motion to run");
    }
}
public class LatihanHierarchicalInheritance {
    public static void main(String[] args) {
        Cars c = new Cars();
        c.run();
        c.move();
    }
}
