
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
 //Exercise #4.6: Fahrenheit to Celsius degree
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter Temperature in degrees Fahrenheit: ");
    double F=input.nextDouble();
    double C=(5*(F-32))/9;
    System.out.printf("Temperature %.2f in degrees Fahrenheit is equel to %.2f in degrees Celsius",F,C);   
}
}
