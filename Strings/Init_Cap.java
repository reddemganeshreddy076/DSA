package Strings;

public class Init_Cap {

    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z')
            ch = (char) (ch - 32);
        return ch;
    }

    public static void main(String[] args) {
        String string = "money is sweeter than honey ";
        String res = "";

        // First character
        res = res + toUpper(string.charAt(0));

        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);

            // If previous character is space → capitalize current
            if (string.charAt(i - 1) == ' ' && ch != ' ') {
                ch = toUpper(ch);
            }

            res = res + ch;
        }

        System.out.println(res);
    }
}

//Money Is Sweeter Than Honey 