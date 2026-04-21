package Strings;


public class Pangram_Check {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";

        boolean isPangram = checkPangram(str);

        if (isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }

    public static boolean checkPangram(String str) {
        str = str.toLowerCase(); // convert to lowercase

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // check if all are true
        for (boolean b : alphabet) {
            if (!b)
                return false;
        }

        return true;
    }
}
