public class hw_1_4 {
    public static void main(String[] args) {
        int year = 1300;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.printf("366 days a year");
        else
            System.out.printf("365 days a year");
    }
}