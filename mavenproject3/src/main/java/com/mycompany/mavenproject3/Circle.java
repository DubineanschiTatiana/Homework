/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

public class Circle {
    double radius;
    
    void calculateArea() {
        double area=radius*radius*Math.PI;
        System.out.println(area);
    }
    
}
