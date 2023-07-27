class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; 
        
        while(j>=0){
            
            if(i>=0 && nums2[j]<nums1[i]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
    }
}