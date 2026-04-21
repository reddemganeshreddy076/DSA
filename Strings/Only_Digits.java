package Strings;

public class Only_Digits {
    public static void main(String[] args) {
        String str = "12345";

        boolean isDigit = true;

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                isDigit = false;
                break;
            }
        }

        if (isDigit)
            System.out.println("Only Digits");
        else
            System.out.println("Not Only Digits");
    }
}