package Strings;

public class Example14
{
    static String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (num != 0 && result.length() < 8) {
            int digit = num & 15;
            result.append(hexChars[digit]);
            num >>>= 4;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args)
    {
        int num =26;
        System.out.println(toHex(num));
    }
}
