public class TestBall {
        public static void main(String[] args) {
            Ball b1 = new Ball("Red", 2, 3);
            Ball b_100 = new Ball();
            Ball b2 = new Ball("Green", 7, 10);
            Ball b3 = new Ball("Purple", 54, 12);
            System.out.println(b_100.getRadius());
            System.out.println(b_100.getColor());
            System.out.println(b_100.getMass());

        }
}
