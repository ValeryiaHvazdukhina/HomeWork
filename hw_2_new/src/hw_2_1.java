import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class hw_2_1 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rnd= new Random();
        int min = 10;
        int max = 99;
        for (int i=0; i < array.length; i++) {
            array[i] = rnd.nextInt(max-min) + min;
        }
        System.out.println("Массив");
        for (int a: array) {
            System.out.println(a);}
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3])
            System.out.println("Возрастающий");
        else
            System.out.println("Не возрастающий");

    }
}