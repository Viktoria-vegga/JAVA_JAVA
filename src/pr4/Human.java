package pr4;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human() {
        head = new Head();
        leftLeg = new Leg("left");
        rightLeg = new Leg("right");
        leftHand = new Hand("left");
        rightHand = new Hand("right");
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public static class Head {
        // Описать свойства и методы для головы человека
    }

    public static class Leg {
        private String side;

        public Leg(String side) {
            this.side = side;
        }

        // Описать свойства и методы для ноги
    }

    public static class Hand {
        private String side;

        public Hand(String side) {
            this.side = side;
        }

    }

}