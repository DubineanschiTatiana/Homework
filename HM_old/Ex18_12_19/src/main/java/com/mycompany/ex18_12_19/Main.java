/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex18_12_19;

public class Main {
public static void main(String ... args){
    
    System.out.println("Perimetru dreptunghi:"+calculatePerimeter(2,2));
    System.out.println("Perimetru patrat:"+calculatePerimeter(2));
    System.out.println("Aria dreptunghi:"+calculateArea(2,2));
    System.out.println("Aria patrat:"+calculateArea(2));
}
static int calculatePerimeter(int length, int width) {
     return 2*(length+width);}
static int calculatePerimeter(int sideLength){
return 4*sideLength; }
static int calculateArea(int length, int width) {
     return length*width;}
static int calculateArea(int sideLength){
return sideLength*sideLength; }
}
