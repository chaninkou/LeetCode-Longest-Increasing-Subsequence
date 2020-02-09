package longestIncreasing;

import java.util.Arrays;

public class FindLongestIncreaseSubsequenceFunction {
	public int lengthOfLIS(int[] nums) {
		if(nums.length == 0 || nums == null){
			return 0;
		}
		
		int[] dp = new int[nums.length];
		
		// 1 as default since the current element itself is a increasing value
		Arrays.fill(dp, 1);
		
		int longestMax = 1;
		
		// Will keep increasing start and compare if it is bigger than end
		for(int end = 1; end < nums.length; end++){
			
			for(int start = 0; start < end; start++){
				if(nums[end] > nums[start]){
					// dp[end] will store the max from that length
					dp[end] = Math.max(dp[end], dp[start] + 1);
				}
			}
			
			// update if needed
			longestMax = Math.max(longestMax, dp[end]);
		}
		
		return longestMax;
	}
}
