package ch02;

// SRP -> Single Responsibility Principle
public class Doorman implements Todoable {

    // DIP -> Dependency Inversion Principle
    @Override
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + "쫒아내");
    }
}
