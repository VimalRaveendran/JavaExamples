package examples;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "CODINGISAWERSOME";
        String result = getUniqueCharacterSubstring(input);
        System.out.println("The longest substring without repeating characters is: " + result);
        System.out.println("The length of the longest substring is: " + result.length());
    }
}

