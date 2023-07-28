class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];

        for (int i=n-1; i>=0; i--) {
            temp[i] = nums[i];
            for(int j=i+1; j<n; j++) {
                temp[j] = Math.max(nums[i]-temp[j],nums[j]-temp[j-1]);
            }
        }
        return temp[n-1]>=0;
    }
}