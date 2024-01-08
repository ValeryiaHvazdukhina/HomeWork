import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw_7_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите дату в формате YYYY/MM/DD hh:mm");
        String date = scn.nextLine();

        Pattern pattern = Pattern.compile("^(1[0-9][0-9][0-9]|20[0-1][0-2])/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|30) (0[1-9]|1[0-9]|2[0-3]):([0-5][0-9])");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            System.out.println("Дата существует");
        } else {
            System.out.println("Даты не существует или неверный формат ввода");
        }
    }
}