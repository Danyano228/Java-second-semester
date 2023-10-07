class TShirt extends Clothes implements MenClothing, WomenClothing{
    // футболка
    // реализовать интерфейсы

    public TShirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("\n\nНа мужчину одета футболка");
        System.out.println("Размер: " + this.size +
                            "\nСтоимость: " + this.cost +
                            "\nЦвет: " + this.color);
    }

    @Override
    public void dressWomen() {
        System.out.println("\n\nНа женщину одета футболка");
        System.out.println("Размер: " + this.size +
                            "\nСтоимость: " + this.cost +
                            "\nЦвет: " + this.color);
    }

}