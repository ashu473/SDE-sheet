class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n=nums.length;   // length of the array
        Map<Integer,Integer> m=new HashMap<>(); 

        for(int i:nums){      // storing the elements of array to map
            m.put(i,m.getOrDefault(i,0)+1);
        }

        List<Integer> ans=new ArrayList<>();  

        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            
            if(e.getValue()>n/3){     // if value>n/3, we add them to the list
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}