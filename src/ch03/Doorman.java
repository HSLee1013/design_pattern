package ch03;

// SRP -> Single Responsibility Principle
public class Doorman {

    // DIP -> Dependency Inversion Principle
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + "쫒아내");
    }
}
