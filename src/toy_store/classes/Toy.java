package toy_store.classes;

public class Toy {
    int id;
    String name;
    int quantity;
    double weight;

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Идентификатор игрушки:" + id + "; Имя: " + name + "; Остаток: " + quantity + "; Вес: " + weight;
    }

}
