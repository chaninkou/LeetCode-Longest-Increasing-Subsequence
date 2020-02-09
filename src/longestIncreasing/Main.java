package longestIncreasing;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] input = {-2, 5, 6, 7, 1, 1, 1, 1};
		
		System.out.println("Input: " + Arrays.toString(input));
		
		FindLongestIncreaseSubsequenceFunction solution = new FindLongestIncreaseSubsequenceFunction();
		
		System.out.println("Solution: " + solution.lengthOfLIS(input));
	}
}
