/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Manager
{
    int salary=100000;
}
class Employee2 extends Manager
{
    int id=15;
    int empSal=25000;
}

public class LatihanInheritance {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        System.out.println("Employee with id "+e.id+" gets "
                +e.empSal+" every month");
        System.out.println("Manager's salary is "+e.salary);
    }
}
