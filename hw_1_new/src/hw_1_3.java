public class hw_1_3 {
    public static void main(String[] args) {
        int number_1 = 1;
        int number_2 = 2;
        int number_3 = 3;
        if (number_1 < number_2 && number_1 < number_3)
            System.out.print(number_2 + number_3);
        else if (number_2 < number_1 && number_2 < number_3)
            System.out.print(number_1 + number_3);
        else if (number_3 < number_1 && number_3 < number_2)
            System.out.print(number_1 + number_2);
    }
}