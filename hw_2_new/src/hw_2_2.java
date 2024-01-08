import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class hw_2_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arraySize = scn.nextInt();
        if (arraySize < 1) {
            System.out.println("Введите размер массива. Число должно быть больше 0.");
            arraySize = scn.nextInt();
        }

        System.out.println("Введите минимальное значение массива");
        int arrayMin = scn.nextInt();
        System.out.println("Введите максимальное значение массива");
        int arrayMax = scn.nextInt();
        if (arrayMin > arrayMax) {
            System.out.println("Введите максимальное значение массива. Число должно быть больше минимального размера массива.");
            arrayMax = scn.nextInt();
        }

        int[] array = new int[arraySize];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(arrayMax - arrayMin) + arrayMin;
        }

        System.out.println("Массив");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}