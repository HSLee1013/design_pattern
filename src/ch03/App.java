package ch03;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Animal cat = new Cat();
        Animal mouse = new Mouse();
        OuterTiger outerTiger = new OuterTiger();
        Animal tigerAdapter = new TigerAdapter(outerTiger);

        doorman.쫓아내(tigerAdapter);
        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
