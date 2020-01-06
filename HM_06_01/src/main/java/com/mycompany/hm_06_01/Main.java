/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hm_06_01;

public class Main {

    public static void main(String... args) {
        String s = "welllcommmmeee";
        System.out.println("The number of triples in the string is: " + findTriples(s));

        String s1 = "it is a string";
        System.out.println("The new string is: " + replaceIs(s1));

        String s2 = "ab5c2d4ef12s";
        System.out.println("The sum of the digits in the string is : " + sumOfDigits(s2));
    }
// EX. 12.5.1

    static int findTriples(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == a[i - 1] && a[i] == a[i + 1]) {
                count++;
            }
        }
        return count;
    }
// EX. 12.5.2

    static String replaceIs(String s) {
        return s.replace("is", "is not");
    }
//EX. 12.5.3

    static int sumOfDigits(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                sum += Integer.parseInt(String.valueOf(a[i]));
            }
        }
        return sum;
    }

}
