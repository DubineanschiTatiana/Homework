public class Rectangle {
private int length;
private int width;

Rectangle(int length, int width){
    this.length=length;
    this.width=width;
}
Rectangle(int side){
    this(side,side);
}
Rectangle(){
    this(0,0);
}
void area() {
    System.out.println("Area: "+length*width);
}




}
