package longestIncreasing;

import java.util.Arrays;

public class FindLongestIncreaseSubsequenceFunction {
	public int lengthOfLIS(int[] nums) {
		if(nums.length == 0 || nums == null){
			return 0;
		}
		
		// Each element will store the max number of increasing subsequences
		int[] dp = new int[nums.length];
		
		// 1 as default since the current element itself is a increasing value
		Arrays.fill(dp, 1);
		
		// since 1 is the minimum in the dp
		int longestMax = 1;
		
		// O(n^2) since we checking from 0 to end every loop
		for(int end = 1; end < nums.length; end++){
			
			for(int start = 0; start < end; start++){
				if(nums[end] > nums[start]){
					// dp[start] will have whatever max it had before
					dp[end] = Math.max(dp[end], dp[start] + 1);
				}
			}
			
			// update if needed
			longestMax = Math.max(longestMax, dp[end]);
		}
		
		return longestMax;
	}
}
