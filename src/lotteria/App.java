package lotteria;

import lotteria.burger.Burger;
import lotteria.burger.CheeseBurger;
import lotteria.burger.ChickenBurger;
import lotteria.material.Carrot;
import lotteria.material.Ham;
import lotteria.material.Sangchu;

public class App {
    public static void main(String[] args) {
        Burger b1 = new CheeseBurger();
        b1.make();
        System.out.println("================");

        Burger b2 = new ChickenBurger(new Ham(new Ham(new Sangchu())));
        b2.make();
        System.out.println("================");

        Burger b3 = new CheeseBurger(new Carrot(new Sangchu(new Ham(new Carrot(new Carrot())))));
        b3.make();
    }
}
