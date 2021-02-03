package algorithms;

import java.util.Stack;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            }
            if (ch == ')') {
                max = Math.max(max, count);
                count--;
            }
        }
        return max;
    }

    public int maxDepthStack(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            if (ch == ')') {
                max = Math.max(max, stack.size());
                stack.pop();
            }
        }
        return max;
    }
}