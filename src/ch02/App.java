package ch02;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        DoormanProxy doormanProxy = new DoormanProxy(doorman);
        Animal cat = new Cat();
        Animal mouse = new Mouse();

        doormanProxy.쫓아내(cat);
        doormanProxy.쫓아내(mouse);
    }
}
