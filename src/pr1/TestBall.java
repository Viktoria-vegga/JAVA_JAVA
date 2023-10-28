package pr1;

public class TestBall {
    public static void test() {
        Ball b1 = new Ball("pink", "big");
        Ball b2 = new Ball("red");
        Ball b3 = new Ball();
        b3.setColor("green");
        System.out.println(b1);
        b1.intoColorSize();
        b2.intoColorSize();
        b3.intoColorSize();
    }
}
