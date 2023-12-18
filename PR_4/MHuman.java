package PR_4;

import PR_4.Human;

public class MHuman {
    public static void main(String[] args){
        Human h1 = new Human(2, 3, 4);
        Human h2 = new Human();
        h2.setHead(10);
        h2.setLeg(5);
        h2.setHand(4);
        System.out.println("h1: " + h1.getHead() + ", " + h1.getLeg()+ ", " +h1.getHand());
        System.out.print("h2: " + h2.getHead()+ ", " + h2.getLeg()+ ", "+ h2.getHand());

    }
}
