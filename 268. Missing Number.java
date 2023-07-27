class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;  // find the sum of n natural numbers
        for(int i:nums){      // subtract the nums from the sum to get the missing number
            sum-=i;
        }
        return sum;
    }
}
