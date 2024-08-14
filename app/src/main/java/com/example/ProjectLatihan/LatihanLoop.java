/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class LatihanLoop {
    public static void main(String[] args) {
        //for loop
        for(int i=10;i>1;i--){
            System.out.println(i);
        }
        System.out.println(" ");
        //labeled loop
        aa:
            for(int i=0;i<5;i++){
                System.out.println(i);
            bb:
            for(int j=0;j<5;j++){
                System.out.println(j);
                break aa;
            }
            System.out.println(i);
            }      
        System.out.println(" ");
        
        //while loop
        int a=10;
        while(a>1)
        {
            System.out.println(a);
            a--;
        }
        System.out.println(" ");
        
        //do..while loop\
        a=2;
        do{
            System.out.println(a);
            a++;
        }while(a>2&&a<10);
        
        System.out.println(" ");
    }
}
