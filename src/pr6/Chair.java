package pr6;

// Класс Chair, наследующийся от Furniture
public class Chair extends Furniture {
    private int numberOfLegs;
    public Chair(String name, double price, String material, int numberOfLegs) {
        super(name, price, material);
        this.numberOfLegs = numberOfLegs;
    }
    @Override
    public void description() {
        System.out.println("Стул " + getName() + " с " + numberOfLegs + " ножками, изготовлен из " + getMaterial() + ".");
    }
}