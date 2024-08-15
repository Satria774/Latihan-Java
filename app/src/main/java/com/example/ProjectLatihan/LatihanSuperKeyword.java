/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Vehicle5{
    String wheels="Vehicle moves because of wheels";
}

class Truck extends Vehicle5{
    String wheels="Truck has 4 wheels";
    void printWheel(){
        System.out.println(wheels);//print wheels in the Truck class
        System.out.println(super.wheels);//print wheels in the Vehicle class
    }
}
public class LatihanSuperKeyword {
    public static void main(String[] args) {
        Truck b = new Truck();
        b.printWheel();
    }
   
}
