package pr3;

public class TestBall {
    public static void test() {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.setX(4);
        b1.move(30, 15);
        System.out.println(b1);
    }
}