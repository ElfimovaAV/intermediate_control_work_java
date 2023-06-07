package toy_store;

import toy_store.classes.Toy;
import toy_store.classes.ToyStore;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Doll", 30);
        Toy toy2 = new Toy(1, "Car", 40);
        Toy toy3 = new Toy(2, "Robot", 5);
        Toy toy4 = new Toy(3, "Puppet", 70);
        Toy toy5 = new Toy(4, "Doll", 30);
        Toy toy6 = new Toy(5, "Car", 40);
        Toy toy7 = new Toy(6, "Robot", 5);
        Toy toy8 = new Toy(7, "Puppet", 70);
        Toy toy9 = new Toy(8, "Doll", 30);
        Toy toy10 = new Toy(9, "Car", 40);

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
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }


}