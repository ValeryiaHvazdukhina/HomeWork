import java.util.Random;
import java.util.Scanner;

public class hw_2_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int N = scn.nextInt(); //размер массива
        if (N < 1) {
            System.out.println("Введите размер массива. Число должно быть больше 0.");
            N = scn.nextInt();
        }
        System.out.println("Введите минимальное значение массива");
        int A = scn.nextInt(); // минимальное значение массива
        System.out.println("Введите максимальное значение массива");
        int B = scn.nextInt(); // максимальное значение массива
        if (A > B) {
            System.out.println("Введите максимальное значение массива. Число должно быть больше минимального размера массива.");
            B = scn.nextInt();
        }
        int[] array = new int[N];

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(B - A) + A;
        }

        int arrayMax = 0;
        for (int max = 0; max < array.length; max++) {
            if (array[max] > array[arrayMax])
                arrayMax = max;
        }

        System.out.println("Массив");
        for (int a : array) {
            System.out.print(a + " "); }
        System.out.println();
        System.out.println("Индекс " + arrayMax);

    }
}