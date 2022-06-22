package cz.divinem127.testovac;


public class Main {
    public static KokotManager kokoti = new KokotManager();
    public static LegManager noziska = new LegManager(new ToeManager());

    public static BodyManager bodyManager = new BodyManager(kokoti, noziska);

    public static void main(String[] args) {

    }
}
