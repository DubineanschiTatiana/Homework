
package com.mycompany.ex7_04;

public class Main{
   public static void main(String ... args) {
       Circle c1=new Circle();
       c1.radius=2.5;
       c1.calculateArea();
       
       Rectangle d1=new Rectangle();
       d1.length=2;
       d1.width=3;
       d1.calculateArea();
       d1.calculatePerimeter();
       
       Shape a=new Shape();
       a.circle.radius=2;
       a.circle.calculateArea();
       a.rectangle.length=2;
       a.rectangle.width=3;
       a.rectangle.calculateArea();
       a.rectangle.calculatePerimeter();
   } 
}
