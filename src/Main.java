import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.print("Сумма элементов массива: ");
        System.out.println((int)sum);
        System.out.print("Среднее арифметическое: ");
        System.out.println(sum / array.length);
    }
}

/*
Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = in.nextInt();

        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += array[i];
        }

        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Среднее арифметическое: ");
        System.out.println(sum / num);
 */