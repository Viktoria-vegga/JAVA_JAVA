package pr6;

public class Cup extends Dish {
    private boolean isDishwasherSafe;

    public Cup(String material, int size, boolean isDishwasherSafe) {
        super(material, size);
        this.isDishwasherSafe = isDishwasherSafe;
    }

    @Override
    public void use() {
        System.out.println("Посуда типа Cup используется для напитков.");
    }

    public boolean isDishwasherSafe() {
        return isDishwasherSafe;
    }
}
