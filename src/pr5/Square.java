package pr5;

public class Square extends Rectangle {
    private double side;

    public Square(){
        this.side=0;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;

    }
    public double getSide() {
        return side; }
    public void setSide(double side) {
        this.side = side; }

    @Override
    public void setLength(double side) {
        this.length =side;
    }
    @Override
    public void setWight(double side) {
        this.wight=side;
    }
    @Override
    public String toString() {
        return "Shape: Square, side: "+this.length +", wight: "+this.wight;
    }
}
