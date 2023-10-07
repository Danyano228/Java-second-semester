import java.util.ArrayList;
import java.util.Arrays;

public class TaskAtelier {

    // создать массив, содержащий все типы одежды

    Clothes[] clothes = {
            new TShirt(Sizes.XXS, 9999.99, "bread"),
            new Pants(Sizes.M, 99999.999, "pink"),
            new Skirt(Sizes.L, 999999.99, "gremlin"),
            new Tie(Sizes.S, 9999999.99, "blue")
    };

    //        (Arrays.asList(new TShirt(32, 9999.99, "blue")), )

    public TaskAtelier() {
        Atelier person = new Atelier();
        person.dressMan(clothes);
        person.dressWomen(clothes);

    }

}
