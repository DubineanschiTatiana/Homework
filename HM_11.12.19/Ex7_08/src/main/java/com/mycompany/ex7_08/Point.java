
package com.mycompany.ex7_08;

public class Point {
double x;
double y;

void quadrant(){
    String r;
    if (x > 0 && y > 0)
        r = "I";
    else if (x < 0 && y > 0)
        r = "II";
    else if (x < 0 && y < 0)
        r = "III";
    else
        r = "IV";
    System.out.println("Value is located in Quadrant: "+r);
}
}
