
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
public class Ex4_8 {
    public static void main(String arg[]){
   //Exercise #4.8: Sum, difference, product, average
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter first integer: ");
    int n1=input.nextInt();
    System.out.println("Please enter second integer: ");
    int n2=input.nextInt();
    int add=n1+n2;
    int sub=n1-n2;
    int mult=n1*n2;
    int div=n1/n2;
    int avr=(n1+n2)/2;
    int rem=n1%n2;
    System.out.println("Results: ");
    System.out.printf("%d + %d = %d \n",n2,n1,add);
    System.out.printf("%d - %d = %d \n",n2,n1,sub);
    System.out.printf("%d * %d = %d \n",n2,n1,mult);
    System.out.printf("%d / %d = %d \n",n2,n1,div);
    System.out.printf("Average of %d and %d is %d \n",n2,n1,avr);
    System.out.printf("Remainder of %d and %d is %d",n2,n1,rem); 
}
}
