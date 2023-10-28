package pr6;

public class Sofa extends Furniture {
    private int seatingCapacity;
    public Sofa(String name, double price, String material, int seatingCapacity) {
        super(name, price, material);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void description() {
        System.out.println("Диван " + getName() + " с вместительностью " + seatingCapacity + " человек, изготовлен из " + getMaterial() + ".");
    }
}
