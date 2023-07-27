class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;   // length of the array
        if(n==1) return 1;
        Arrays.sort(nums);  // sort the array
        int count=1;
        int ans=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>n/2){  // if count>n/2, store it in ans and come out of the loop
                    ans=nums[i];
                    break;
                }
            }else{
                count=1;
            }
        }
        return ans;
    }
}