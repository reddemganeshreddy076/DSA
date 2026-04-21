package Strings;

public class Zigzag_Conversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int index = 0, step = 1;

        for (char c : s.toCharArray()) {
            rows[index].append(c);

            if (index == 0) step = 1;
            else if (index == numRows - 1) step = -1;

            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows)
            result.append(row);

        System.out.println(result.toString());
    }
}
/*
P   A   H   N
A P L S I I G
Y   I   R
*/