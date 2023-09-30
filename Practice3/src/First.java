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

    public void generateArr() {
        if (length > 0) {
            arr1 = new double[length];
            arr2 = new double[length];
            generator();
        }
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
        sorting(arr1);
        sorting(arr2);
    }

    private void sorting(double[] arr) {
        int flag = 0;
        double value;
        while (flag < length - 1) {
            if (arr[flag] <= arr[flag + 1]) {
                flag++;
            }
            else {
                value = arr[flag];
                arr[flag] = arr[flag + 1];
                arr[flag + 1] = value;
                if (flag != 0) {
                    flag--;
                }
            }
        }
    }
}
