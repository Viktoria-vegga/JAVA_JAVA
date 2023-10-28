package pr1;

import java.lang.*;
public class Ball {
    private String color;
    private String size;
    public Ball(String n, String a){
        color = n;
        size = a;
    }
    public Ball(String n){
        color = n;
        size = "small";
    }
    public Ball(){
        color ="black";
        size = "small";
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor(String color){
        return color;
    }
    public String getSize(String size) {
        return size;
    }
    @Override
    public String toString(){
        return this.color+" and "+this.size;
    }

    public void intoColorSize(){
        System.out.println("pr1.Ball is " + color+" and "+size);
    }
}
