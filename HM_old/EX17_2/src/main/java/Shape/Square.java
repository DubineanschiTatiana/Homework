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
public class Square extends TwoDimensionalShape{
private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

}
