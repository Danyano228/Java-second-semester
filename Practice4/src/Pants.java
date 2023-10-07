public class Pants extends Clothes implements MenClothing, WomenClothing{
    // штаны
    // реализовать интерфейсы

    public Pants(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("\n\nНа мужчину одеты штаны");
        System.out.println("Размер: " + this.size +
                "\nСтоимость: " + this.cost +
                "\nЦвет: " + this.color);
    }

    @Override
    public void dressWomen() {
        System.out.println("\n\nНа женщину одеты штаны");
        System.out.println("Размер: " + this.size +
                "\nСтоимость: " + this.cost +
                "\nЦвет: " + this.color);
    }
}