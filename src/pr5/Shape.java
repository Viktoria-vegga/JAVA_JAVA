package pr5;

public abstract class Shape {
    protected  String color;
    protected boolean  filled;
    public Shape()
    {
        this.color="-";
        this.filled= false;
    };
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    };
    public String getColor()
    {return color;};
    public void setColor(String color)
    {this.color=color;};
    public boolean isFilled()
    {
        if(color!="-")
        { return true;}
        else{return false;}
    };
    public void getColor(boolean filled)
    {

    };
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color: " + color + "Filled: " + filled;
    }
}
