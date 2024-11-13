package ch03;

public abstract class Animal {
    private String name;

    protected Animal(){}

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
