package pr6;

public abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark(); // Абстрактный метод для лая

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Барон", 3);

        System.out.println("Имя лабрадора: " + labrador.getName());
        System.out.println("Возраст лабрадора: " + labrador.getAge());
        labrador.bark();
    }
}