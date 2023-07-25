class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;   // length of the array
        int idx=-1;

        // find the break point
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        // if break point does not exist, return reverse of array
        if(idx==-1){  
            reverse(nums,0,n-1);
            return;
        }

        // if break point exist, return reverse of array
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }

    // function to reverse the array
    public void reverse(int nums[],int l,int r){             // l=left index & r=right index
        int st=l;
        int end=r;
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }

    // function to swap the elements
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}