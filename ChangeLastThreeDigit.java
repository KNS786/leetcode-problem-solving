
public class ChangeLastThreeDigit {

    public static void lastThreeDigitChange(String str, String c) {
        System.out.println(str.substring(0, str.length() - 3) + c.repeat(3));
    }

    public static void main(String[] args) {
        lastThreeDigitChange("3455 6916 2983 563", "X");
    }
}