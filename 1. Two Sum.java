class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int rest = target - nums[i];
            if (m.containsKey(rest)) {       // if m contains rest key, then return the array
                return new int[]{m.get(rest), i};
            }
            m.put(nums[i], i);
        }
        return new int[]{}; // No solution found
    }
}