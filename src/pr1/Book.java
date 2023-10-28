package pr1;

import java.lang.*;
public class Book {
    private String name;
    private String author;
    public Book(String n, String a){
        name = n;
        author = a;
    }
    public Book(String n){
        name = n;
        author = "unknown";
    }
    public Book(){
        name ="untitled";
        author = "unknown";
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String name) {
        this.author = author;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String author) {
        return author;
    }
    public String toString(){
        return this.name+" "+this.author;
    }

    public void intoNameAuthor(){
        System.out.println("My favorite book is " + name+" "+author);
    }
}
