/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Vehicle6{
    void run(){System.out.println("Vehicle is running");}
}

class Bus extends Vehicle6{
    void run(){System.out.println("Bus is running safely");}
}
public class LatihanDynamicBinding {
    public static void main(String[] args) {
        Vehicle6 obj = new Vehicle6();
        obj.run();
    }
}
