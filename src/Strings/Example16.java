package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Example16 {
    static String reverseVowels(String s)
    {
        Set<Character> vowels = new HashSet<>(
                Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right)
        {
            while (left < right && !vowels.contains(arr[left]))
            {
                left++;
            }

            while (left < right && !vowels.contains(arr[right]))
            {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str1 = "leetcode";
        System.out.println(reverseVowels(str1));
    }
}
