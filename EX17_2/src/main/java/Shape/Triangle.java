/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author Slava
 */
public class Triangle extends TwoDimensionalShape{
private double [] sides;

    public Triangle(double[] sides) {
        this.sides = sides;
    }

    public double[] getSides() {
        return sides;
    }
    
}
