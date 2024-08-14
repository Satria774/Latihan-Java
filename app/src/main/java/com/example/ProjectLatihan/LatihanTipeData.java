/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class LatihanTipeData {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50f;
        char c = 'A';
        double d = 60d;
        boolean bln = true;
        String str = "Hello";
        
        System.out.println(b+" "+ s+" "+ i+" "+ l+" "+f+" "+c+" "+d+" "+bln+" "+str);
        
        System.out.println(" ");
        
        //implicit conversion
        int k=c;
        float g=c;
        long q=c;
        double p=c;
        
        System.out.println(c+" "+ k+" "+ g+" "+ q+" "+p);
        
        System.out.println(" ");
        
        //need of type conversion
        int a =100;
        String m="Hello";
        String o=a+m;
        System.out.println(a+" "+ m+" "+ o);
        System.out.println(" ");
        
        //explicit type of convertion
        double y=45d;
        int v=(int)y;
        
        System.out.println(y+" "+ v);
        System.out.println(" ");
        
        //type conversion
        String w="24";
        int r=23;
        int num=Integer.parseInt(w);
        int num2=Integer.valueOf(w);
        String s2=Integer.toString(r);
        String s3=String.valueOf(r);
        
        System.out.println(w+" "+ r+" "+ num+" "+num2+" "+s2+" "+s3);
        System.out.println(" ");
        
        //unary operators
        i++;
        System.out.println(i);
        
        i--;
        System.out.println(i);
        
        bln=!bln;
        System.out.println(bln);
        System.out.println(" ");
        
        //arithmatic operators
        int res;
        res = i+k;
        System.out.println(res);
        res = k-i;
        System.out.println(res);
        res = i*k;
        System.out.println(res);
        res = k/i;
        System.out.println(res);
        res = k%i;
        System.out.println(res);
        System.out.println(" ");
        
        //shift operators
        i=i<<2;
        System.out.println(i);
        
        i=30;
        i=i>>2;
        System.out.println(i);
        System.out.println(" ");
        
        //relational operators
        bln = i<k;
        System.out.println(bln);
        bln = i>k;
        System.out.println(bln);
        bln = i==k;
        System.out.println(bln);
        System.out.println(" ");
        
        //assignment operators
        i=30;
        k=45;
        i+=k;
        System.out.println(i);
        System.out.println(" ");
        
        //tenary operators
        int ter=i<k?100:200;
        System.out.println(ter);
        System.out.println(" ");
        
        //logical operators
        i=30;
        k=45;
        r=23;
        ter=200;
        
        bln=i<k&&r<k;
        System.out.println(bln);
        bln=i>k&&ter<k;
        System.out.println(bln);
        System.out.println(" ");
        

    }
}
