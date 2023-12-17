import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {

    public static void abbreviation(String exp, String text){
        Pattern pattern = Pattern.compile(exp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }
}
