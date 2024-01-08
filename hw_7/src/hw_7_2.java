import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw_7_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scn.nextLine();

        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]+\\.com\\b");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Cсылки не найдено");
        }
    }
}