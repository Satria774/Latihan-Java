/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Shop{
    int itemid;
    int price;
    String name;
    
    Shop(int a, int b){
        itemid=a;
        price=b;
        name="XYZ";
        System.out.println(itemid+" "+price+" "+name);
    }
    
    Shop(int i, int p, String n){
        itemid=i;
        price=p;
        name=n;
        System.out.println(itemid+" "+price+" "+name);
    }
}
public class LatihanOverloadingConstruct {
    public static void main(String[] args) {
        Shop s1=new Shop(1, 100);
        Shop s2=new Shop(10, 2500,"John");
    }
}
