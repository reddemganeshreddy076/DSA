package Strings;

public class Remove_Digits {
    public static void main(String[] args) {
        String str = "a1b2c3";

        String result = "";

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}