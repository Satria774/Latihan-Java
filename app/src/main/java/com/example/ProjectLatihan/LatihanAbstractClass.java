/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

abstract class Mobile{
    Mobile(){System.out.println("Mobile is the base class");}
    abstract void run();
    void dialNumber(){System.out.println("Number are dialled from nokia mobile");}
}

class Nokia extends Mobile{
    void run(){System.out.println("Nokia is the derived class");}
}
public class LatihanAbstractClass {
    public static void main(String[] args) {
        Mobile obj = new Nokia();
        obj.run();
        obj.dialNumber();    
    }       
}
