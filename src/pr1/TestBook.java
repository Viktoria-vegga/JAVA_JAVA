package pr1;

public class TestBook {
    public static void test() {
        Book b1 = new Book("<<Евгений Онегин>>", "Пушкин А,С.");
        Book b2 = new Book("<<Война и Мир>>");
        Book b3 = new Book();
        b3.setName("<<Алые Паруса>>");
        System.out.println(b1);
        b1.intoNameAuthor();
        b2.intoNameAuthor();
        b3.intoNameAuthor();
    }
}
