//Link: https://leetcode.com/problems/longest-palindromic-substring/

class LongestPalindrome {
    String res = new String();
    int longestLen = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            // odd
            updatePalindromeValues(s, i, i);
            // even
            updatePalindromeValues(s, i, i + 1);
        }
        return res;
    }

    private void updatePalindromeValues(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            int currLen = right - left + 1;
            if (longestLen < currLen) {
                longestLen = currLen;
                res = s.substring(left, right + 1);
            }
            left--;
            right++;
        }
    }
}