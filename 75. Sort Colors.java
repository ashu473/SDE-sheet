class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

        int count0=0;
        int count1=0;
        int count2=0;   
        for(int i=0;i<n;i++){         // count the number of 0's, 1's, 2's
            if(nums[i]==0){
                count0++;
            }else if(nums[i]==1){
                count1++;
            }else{
                count2++;
            }
        }

        for(int i=0;i<count0;i++){   // run the loop from 0-> count0 , and add 0 at that index of nums 
            nums[i]=0;
        }

        int x=count0+count1;         // run the loop from count0-> x , and add 1 at that index of nums
        for(int i=count0;i<x;i++){
            nums[i]=1;
        }

        int y=x+count2;              // run the loop from count0+count1 -> y , and add 2 at that index of nums
        for(int i=count0+count1;i<y;i++){
            nums[i]=2;
        }

    }
}