package classes;

public class Main {
    public static void main(String[] args) {
        ChairFactory brokenChairFactory = new BrokenChairFactory();
        Chair brokenChair = brokenChairFactory.createChair();

        ChairFactory victorianChairFactory = new VictorianChairFactory();
        Chair victorianChair = victorianChairFactory.createChair();

        ChairFactory magicChairFactory = new MagicChairFactory();
        Chair magicChair = magicChairFactory.createChair();

        Client client = new Client();
        client.stab(brokenChair);
        client.stab(victorianChair);
        client.stab(magicChair);
    }
}
