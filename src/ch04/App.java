package ch04;

public class App {
    public static void main(String[] args) {
        Doorman doorman = Doorman.instance;
        Doorman doorman2 = Doorman.instance;

        System.out.println(doorman.hashCode());
        System.out.println(doorman2.hashCode());

        Animal cat = new Cat();
        Animal mouse = new Mouse();

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
