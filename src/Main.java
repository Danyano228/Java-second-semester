import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }

        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Среднее арифметическое: ");
        System.out.println(sum / array1.length);
    }

    public static void second() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = in.nextInt();

        int[] array2 = new int[num];
        for (int i = 0; i < num; i++) {
            array2[i] = in.nextInt();
        }
        in.close();

        int max=0, min=0;
        for (int i=0; i<array2.length; i++){
            if (array2[i] > max) max = array2[i];
            else if (array2[i] < min) min = array2[i];
        }

        System.out.print("Наибольший элемент: ");
        System.out.println(max);
        System.out.print("Наименьший элемент: ");
        System.out.println(min);
    }
}