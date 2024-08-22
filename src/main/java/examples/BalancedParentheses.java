package examples;

import java.util.Arrays;
import java.util.List;

public class BalancedParentheses {

    private static final List<Character> OPEN_PARENTHESES_LIST = Arrays.asList('{', '[', '(');

    public static void main(String[] args) {
        char[] inputArr = {'{','[','[','(',')','}','}',']',']','(','{',')',']',')'};
        int parenthesesCount = 0;
        for(char c: inputArr){
            if(OPEN_PARENTHESES_LIST.contains(c)) {
                parenthesesCount++;
                continue;
            }
            parenthesesCount--;
        }
        if(parenthesesCount != 0)
            System.out.println("Open/Closed Parentheses' doesn't match.");
        else
            System.out.println("Open/Closed Parentheses' match correctly.");
    }
}
