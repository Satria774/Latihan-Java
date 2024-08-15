/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Employee1{
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class LatihanEncapsulation {
    public static void main(String[] args) {
        Employee1 e=new Employee1();
        e.setName("Alex");
        System.out.println(e.getName());
    }
}
