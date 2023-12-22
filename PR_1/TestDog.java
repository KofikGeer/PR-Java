public class TestDog {
    public static void main(String[] args) {
            mirea__lab__1.Dog d1 = new mirea__lab__1.Dog("Mike", 2);
            mirea__lab__1.Dog d2 = new mirea__lab__1.Dog("Helen", 7);
            mirea__lab__1.Dog d3 = new mirea__lab__1.Dog("Bob");
            d3.setAge(1);
            System.out.println(d1);
            d1.intoHumanAge();
            d2.intoHumanAge();
            d3.intoHumanAge();
    }
}
