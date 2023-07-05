package toy_store;

import toy_store.classes.Toy;
import toy_store.classes.ToyStore;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Doll", 3,30);
        Toy toy2 = new Toy(1, "Car", 2, 40);
        Toy toy3 = new Toy(2, "Robot", 1, 5);
        Toy toy4 = new Toy(3, "Puppet", 3, 70);
        Toy toy5 = new Toy(4, "Teddy Bear", 2, 30);
        Toy toy6 = new Toy(5, "Ball", 1,40);
        Toy toy7 = new Toy(6, "Whirligig", 3, 5);
        Toy toy8 = new Toy(7, "Blocks", 2, 70);
        Toy toy9 = new Toy(8, "Lock blocks", 3, 30);
        Toy toy10 = new Toy(9, "Train", 1, 40);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy10);
        toys.add(toy9);
        toys.add(toy8);
        toys.add(toy7);
        toys.add(toy6);
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();
        toyStore.getPrizeToy();


    }


}