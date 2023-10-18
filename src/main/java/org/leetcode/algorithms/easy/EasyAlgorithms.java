package org.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class EasyAlgorithms {


    /**
     * isPalindrome Algorithm
     * https://leetcode.com/problems/palindrome-number/description/
     */
    public boolean isPalindrome(int x) {
        int y = x;
        int res = 0;
        while (y > 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }


    /**
     * Roman to Integer Problem
     * https://leetcode.com/problems/roman-to-integer/
     */
    public int romanToInt(String s) {
        Map<Character, Integer> romanLang = new HashMap<>();
        romanLang.put('I', 1);
        romanLang.put('V', 5);
        romanLang.put('X', 10);
        romanLang.put('L', 50);
        romanLang.put('C', 100);
        romanLang.put('D', 500);
        romanLang.put('M', 1000);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i += 1) {
            char firstChar = chars[i];
            char secondChar = chars[i + 1];
            int firstNum = romanLang.get(firstChar);
            int secondNum = romanLang.get(secondChar);
            if (i + 1 == chars.length) {
                sum += firstNum;
                return sum;
            }
            if (firstNum < secondNum) {
                sum = sum + (secondNum - firstNum);
                i = i + 1;
            } else {
                sum += firstNum;
            }
        }
        return sum;
    }


}
