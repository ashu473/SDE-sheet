class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> st=new HashSet<>();
        // int x=0;
        // for(int i:nums){
        //     if(!st.contains(i)){
        //         st.add(i);
        //     }else{
        //         x=i;
        //     }
        // }
        // return x;

        Arrays.sort(nums);
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}