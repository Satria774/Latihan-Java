/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Man{
    void pay(){
        System.out.println("Paying bill");
    }
}
class Millionaire extends Man{
    void pay(){
        System.out.println("Miilionaire is paying bill and giving tip also");
    }
}
public class LatihanPolymorphism {
    public static void main(String[] args) {
       Man obj = new Millionaire();
       obj.pay();
    }
}
