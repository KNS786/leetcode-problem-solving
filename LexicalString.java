public class LexicalString {
    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "java";

        // length of string
        System.out.println(input1.length() + input2.length());

        // is lexicographically greater than input2
        System.out.println(input1.charAt(0) < input2.charAt(0));

        // print word with first and last chars caps
        System.out.println(
                input1.substring(0, 1).toUpperCase() + input1.substring(1) + " " + input2.substring(0, 1).toUpperCase()
                        + input2.substring(1));
    }
}
