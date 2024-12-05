public class GoalParser {

    public static void goalParser(String str) {
        // StringBuilder res = new StringBuilder();
        // int i = 0;
        // while (i < str.length()) {
        // if (str.charAt(i) == 'G') {
        // res.append(str.charAt(i));
        // i++;
        // } else if (str.startsWith("()", i)) {
        // res.append('O');
        // i += 2;
        // } else if (str.startsWith("(al)", i)) {
        // res.append("al");
        // i += 4;
        // }
        // }

        // System.out.println(res.toString());

        String res = str.replace("()", "o").replace("(al)", "al");
        System.out.println(res);
    }

    public static void main(String[] args) {
        goalParser("G()(al)");
        goalParser("()G()()()(al)");

    }
}
