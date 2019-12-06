
package com.mycompany.ex5_19;
public class Main{
    public static void main(String ... args) {
        int i = 1;
        int s =0;
        while (i>0 && i<101) {
         s+=i;
         i++;
        }
        System.out.println("Sum from 1 to 100 is "+s);
    }
}
