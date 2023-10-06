public class TaskAtelier {

    private enum Sizes {
        XXS (32) {
            public String getDescription() {
                return "Детский размер";
            }
        },
        XS (34),
        S (36),
        M (38),
        L (40);

        private final int euroSize;

        private Sizes(int eurosize) {
            this.euroSize = eurosize;
        }

        public String getDescription() {
            return "Взрослый размер";
        }

    }

    public interface MenClothing {
        public void dressMan();
    }

    public interface WomenClothing {
        public void dressWomen();
    }

    abstract class Clothes {
        private int size;
        private int cost;
        private char color;
    }

    class TShirt extends Clothes {
        // футболка
        // реализовать интерфейсы
    }

    class Pants extends Clothes {
        // штаны
        // реализовать интерфейсы
    }

    class Skirt extends Clothes {
        // юбка
        // реализовать интерфейс WomenClothing
    }

    class Tie extends Clothes {
        // галстук
        // реализовать интерфейс MenClothing
    }

    // создать массив, содержащий все типы одежды

    class Atelier {
        public void dressWomen() { // принимает массив

        }

        public void dressMan() { // принимает массив

        }

        public void dressWomen() {
            // Вывод всей женской одежды
        }

        public void dressMan() {
            // Вывод всей мужской одежды
        }
    }

}
