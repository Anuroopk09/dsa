package Arrays;

import java.util.*;

class Example67
{
    static List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> res = new ArrayList<>();

        if (s == null || s.length() == 0 || words.length == 0)
        {
            return res;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;

        Map<String, Integer> target = new HashMap<>();

        for (String word : words)
        {
            target.put(word, target.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++)
        {
            int left = i;
            int count = 0;

            Map<String, Integer> window = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen)
            {
                String word = s.substring(right, right + wordLen);

                if (target.containsKey(word))
                {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > target.get(word))
                    {
                        String leftWord = s.substring(left, left + wordLen);

                        window.put(leftWord, window.get(leftWord) - 1);

                        left += wordLen;
                        count--;
                    }

                    if (count == wordCount)
                    {
                        res.add(left);

                        String leftWord = s.substring(left, left + wordLen);

                        window.put(leftWord, window.get(leftWord) - 1);

                        left += wordLen;
                        count--;
                    }
                }
                else
                {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words));

    }
}