//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while
// preserving the order of characters. No two characters may map to the same character,
// but a character may map to itself.
//
//Example 1:
//
//        Input: s = "egg", t = "add"
//        Output: true
//Example 2:
//        Input: s = "foo", t = "bar"
//        Output: false
//Example 3:
//        Input: s = "paper", t = "title"
//        Output: true

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sKey = s.charAt(i);
            Character tValue = t.charAt(i);

            if (!charMap.containsKey(sKey)) {
                if (!charMap.containsValue(tValue)) {
                    charMap.put(sKey, tValue);
                } else {
                    return false;
                }
            } else {
                if (!charMap.get(sKey).equals(tValue)) {
                    return false;
                }
            }
        }
        return true;

    }
}