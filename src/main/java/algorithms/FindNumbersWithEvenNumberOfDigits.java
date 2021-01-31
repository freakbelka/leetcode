package algorithms;

import java.util.Arrays;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).toCharArray().length % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int findNumbersUsingStream(int[] nums) {
        return (int) Arrays.stream(nums).filter(num -> String.valueOf(num).toCharArray().length % 2 == 0).count();
    }
}
