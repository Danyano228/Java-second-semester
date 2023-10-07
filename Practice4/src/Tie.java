public class Tie extends Clothes implements MenClothing {
    // галстук
    // реализовать интерфейс MenClothing

    public Tie(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("\n\nНа мужчину одет галстук");
        System.out.println("Размер: " + this.size +
                            "\nСтоимость: " + this.cost +
                            "\nЦвет: " + this.color);
    }
}