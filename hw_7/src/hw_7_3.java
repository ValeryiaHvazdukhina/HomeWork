import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw_7_3 {
    public static void main(String[] args) {
        String str = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = Pattern.compile("\\b+a{1}+[a-z]{1}+b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}