
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum=0;
        for (int i : array) {
            sum += i;
        }

        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Среднее арифметическое: ");
        System.out.println((double)sum / array.length);
    }
}

/*
import java.util.Scanner;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = in.nextInt();

        if (num <= 0) {
            System.out.println("Неверный ввод");
            return;
        }

        int[] array = new int[num];
        int i = 0;
        while (i < num) {
            array[i] = in.nextInt();
            i++;
        }
        in.close();

        int max=0, min=2147483647;
        i=0;
        do{
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
            i++;
        } while (i < num);

        System.out.print("Наибольший элемент: ");
        System.out.println(max);
        System.out.print("Наименьший элемент: ");
        System.out.println(min);
 */