package ch04;

// SRP -> Single Responsibility Principle
public class Doorman {

    static Doorman instance = new Doorman();

    private Doorman() {}

    // DIP -> Dependency Inversion Principle
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + "쫒아내");
    }

}
