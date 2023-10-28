package pr6;

public abstract class Dish {
    private String material;
    private int size; // Размер посуды в миллилитрах
    public Dish(String material, int size) {
        this.material = material;
        this.size = size;
    }

    public abstract void use(); // Абстрактный метод для использования посуды

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", 250, true);
        Cup cup = new Cup("Стекло", 350, false);

        System.out.println("Материал тарелки: " + plate.getMaterial());
        System.out.println("Можно ли использовать тарелку в микроволновой печи? " + plate.isMicrowaveSafe());

        System.out.println("Материал чашки: " + cup.getMaterial());
        System.out.println("Можно ли мыть чашку в посудомоечной машине? " + cup.isDishwasherSafe());

        plate.use();
        cup.use();

    }
}
