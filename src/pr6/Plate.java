package pr6;

public class Plate extends Dish {
    private boolean isMicrowaveSafe;

    public Plate(String material, int size, boolean isMicrowaveSafe) {
        super(material, size);
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public void use() {
        System.out.println("Посуда типа Plate используется для подачи еды.");
    }

    public boolean isMicrowaveSafe() {
        return isMicrowaveSafe;
    }
}