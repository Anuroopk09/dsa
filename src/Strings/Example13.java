package Strings;

class Example13 {
    static boolean isPalindrome(String s)
    {
        int low = 0;
        int high = s.length() - 1;

        while(low < high)
        {
            char left = s.charAt(low);
            char right = s.charAt(high);


            if(!Character.isLetterOrDigit(left))
            {
                low++;
                continue;
            }


            if(!Character.isLetterOrDigit(right))
            {
                high--;
                continue;
            }


            if(Character.toLowerCase(left) != Character.toLowerCase(right))
            {
                return false;
            }

            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str1));

    }
}