package PR_4;

public class Human {
    private int head;
    private int leg;
    private  int hand;

    public Human(int h, int l, int ha){
        head = h;
        leg = l;
        hand = ha;
    }

    public Human(){
        head = 1;
        leg = 2;
        hand = 2;
    }

    public void setHead(int h){
        this.head = h;
    }
    public void setLeg(int l){
        this.leg = l;
    }
    public void setHand(int ha){
        this.hand = ha;
    }

    public int getHead(){
        return head;
    }
    public int getLeg(){
        return leg;
    }
    public int getHand(){
        return hand;
    }
}
