package pr5;

public class Rectangle extends Shape {
    protected double wight;
    protected double length;
    public Rectangle(){
        this.wight = 0;
        this.length = 0;
    }
    public Rectangle(double wight, double lenght){
        this.wight = wight;
        this.length = lenght;
        this.color = "black";
    }
    public Rectangle(double wight, double lenght, String color, boolean filled){
        this.wight = wight;
        this.length = lenght;
        this.color = color;
        this.filled=filled;
    }
    public double getWight() {
        return wight; }
    public void setWight(double wight) {
        this.wight = wight; }
    public double getLength() {
        return length; }
    public void setLength(double length) {
        this.length = this.length; }
    @Override
    public double getArea() {
        return length *wight; }
    @Override
    public double getPerimeter() {
        return 2*(length +wight); }
    @Override
    public String toString() {
        return "Shape: Rectangle, length: "+this.length +", wight: "+this.wight;
    }
}
