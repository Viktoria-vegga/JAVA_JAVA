package pr9;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable animal = new Animal("Лев");

        System.out.println("Имя планеты: " + planet.getName());
        System.out.println("Имя животного: " + animal.getName());

        Priceable product = new Product("Телевизор", 500.0);
        System.out.println("Цена продукта '" + ((Product) product).getName() + "': $" + product.getPrice());
    }
}