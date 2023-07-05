package toy_store.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToysAwaitingDelivery() {
        RandomToyChooser random = new RandomToyChooser();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void getPrizeToy() {
        Toy toy = getToysAwaitingDelivery();
        String text = toy.toString();
        String fileName = "Toys.txt";
        try (FileWriter writer = new FileWriter(fileName, true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        if (toy.getQuantity() >= 1) {
            toy.setQuantity(toy.getQuantity() - 1);
        } else {
            toys.remove(toy);
        }
        System.out.println("Your prize is recorded in a file 'Toys'");
    }
}