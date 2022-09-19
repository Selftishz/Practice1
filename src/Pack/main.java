package Pack;

import java.util.Scanner;
public class main {
    public static void factorial(int a) {

        long fact = 1;

        for (int i = 2; i <= a; i++)
            fact *= i;

        System.out.println("Факториал = " + fact);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массива: ");

        double sum = 0;
        int size = 0;
        int i = 0;

        if (input.hasNextInt() == true) {

            size = input.nextInt();

            int[] b = new int[size];

            for (i = 0; i < b.length; i++) {
                System.out.println("Введите элемент масива");
                b[i] = input.nextInt();
                sum += b[i];
            }

            int min = b[0], max = b[0];
            i = 1;
            while (i < b.length) {
                if(b[i] >= max) max = b[i];
                if(b[i] <= min) min = b[i];
                i++;
            }

            System.out.println("MAX элемент массива: " + max);
            System.out.println("MIN элемент массива: " + min);
            System.out.println("Сумма элементов массива = " + sum);
            System.out.println("Среднее арифметическое массива = " + sum/size);

        } else System.out.println("Введено не целое число");

        System.out.println("Вывод первых 10 чисел гармонического ряда: ");
        for (i = 1; i < 10; i++) {
            System.out.println(i + " ");
        }

        System.out.println("Введите факториал какого числа необходимо найти: ");

        int fac = input.nextInt();
        factorial(fac);

    }
}
