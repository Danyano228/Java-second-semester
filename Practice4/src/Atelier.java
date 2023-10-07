public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.print("Женщина:");
        for (Clothes cloth: clothes) {
            cloth.dressWomen();
        }
        System.out.println("\n");
    }

    public void dressMan(Clothes[] clothes) {
        System.out.print("Мужчина:");
        for (Clothes cloth: clothes) {
            cloth.dressMan();
        }
        System.out.println("\n");
    }


}