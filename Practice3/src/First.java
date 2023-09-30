import java.lang.Math;
import java.util.Random;

public class First {
    private int length = 10;
    private double arr1[], arr2[];

    public First(int length) {
        if (length <= 0) {
            System.out.println("Wrong length!\nSet the length manually.");
        }
        else {
            this.length = length;
            generateArr();
        }
    }

    private void generator() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr1[i] = Math.random() * 100;
            arr2[i] = rand.nextDouble(100);
        }
    }

    public int generateArr() {
        if (length <= 0) {
            return 1;
        }
        arr1 = new double[length];
        arr2 = new double[length];
        generator();
        return 0;
    }

    public void printArr() {
        System.out.print(arr1[0]);
        for (int i = 1; i < length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.print("\n" + arr2[0]);
        for (int i = 1; i < length; i++) {
            System.out.print(" " + arr2[i]);
        }
        System.out.println("\n");
    }

    public void sort() {
        double value;
        int flag = 0;
        while (flag < length - 1) {
            if (arr1[flag] <= arr1[flag + 1]) {
                flag++;
            }
            else {
                value = arr1[flag];
                arr1[flag] = arr1[flag + 1];
                arr1[flag + 1] = value;
                if (flag != 0) {
                    flag--;
                }
            }
        }
        flag = 0;
        while (flag < length - 1) {
            if (arr2[flag] <= arr2[flag + 1]) {
                flag++;
            }
            else {
                value = arr2[flag];
                arr2[flag] = arr2[flag + 1];
                arr2[flag + 1] = value;
                if (flag != 0) {
                    flag--;
                }
            }
        }
    }
}
