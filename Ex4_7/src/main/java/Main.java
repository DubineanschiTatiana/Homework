
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tati
 */
public class Main {
    public static void main(String arg[]){
  //Exercise #4.7:minutes to nr. of years and days
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter minutes: ");
    int m=input.nextInt();
    int y=m/24/60/365;
    int d=m/24/60;
        System.out.println("Number of years: "+y);
        System.out.println("Number of days: "+d);  
}
}
