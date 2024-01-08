import java.util.Random;
import java.util.Scanner;

public class hw_2_4 {
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

        System.out.println("Массив");
        for (int a : array) {
            System.out.print(a + " "); }
        System.out.println();

        for (int j = 0; j < array.length-1; j++) {
            if (array[j] > array[j+1]) {
                int t = array[j];
                array[j] = array[j+1];
                array[j+1] = t;
            }
        }

        System.out.println("Отсортированный массив");
        for (int b : array) {
            System.out.print(b + " "); }
    }
}