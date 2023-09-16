import java.util.Scanner;

public class Main {

    static void first() {
        System.out.println(" 1 )");
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

    static void second(Scanner in) {
        System.out.println(" 2 )");
        System.out.print("Введите длину массива: ");
        int num = in.nextInt();

        if (num <= 0) {
            System.out.println("Неверный ввод");
            return;
        }

        int[] array = new int[num];
        int i = 0, sum = 0;
        while (i < num) {
            array[i] = in.nextInt();
            sum += array[i];
            i++;
        }

        int max=0, min=2147483647;
        i=0;
        do{
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
            i++;
        } while (i < num);

        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Наибольший элемент: ");
        System.out.println(max);
        System.out.print("Наименьший элемент: ");
        System.out.println(min);
    }

    static void third(String[] args) {
        System.out.println(" 3 )");
        for (int i = 0; i < args.length; i++){
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }

    static void fourth() {
        System.out.println(" 4 )");
        for (int i = 1; i < 11; i++) {
            System.out.println(1./i);
        }
    }

    static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result*i;
        }
        return result;
    }

    static void fifth(Scanner in) {
        System.out.println(" 5 )");
        System.out.print("Введите число: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("Неверный ввод");
            return;
        }
        System.out.println(factorial(n));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        first();
        second(in);
        third(args);
        fourth();
        fifth(in);

        in.close();
    }
}