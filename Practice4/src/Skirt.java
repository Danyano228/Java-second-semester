public class Skirt extends Clothes implements WomenClothing{
    // юбка
    // реализовать интерфейс WomenClothing

    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("\n\nНа женщину одета юбка");
        System.out.println("Размер: " + this.size +
                "\nСтоимость: " + this.cost +
                "\nЦвет: " + this.color);
    }
}