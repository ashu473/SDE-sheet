class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);

            if(sum<0) sum=0;        // if sum<0 then no need to continue with that subarray so make sum=0
        }
        return max;
    }
}