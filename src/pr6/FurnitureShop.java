package pr6;

public class FurnitureShop {
    public void displayFurniture(Furniture furniture) {
        furniture.description();
        System.out.println("Цена: $" + furniture.getPrice());
        System.out.println("Материал: " + furniture.getMaterial());
        System.out.println();
    }
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Стул №1", 50.0, "Дерево", 4);
        Sofa sofa = new Sofa("Диван XL", 400.0, "Ткань", 3);

        shop.displayFurniture(chair);
        shop.displayFurniture(sofa);
    }
}