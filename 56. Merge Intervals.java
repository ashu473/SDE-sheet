class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(x,y)->Integer.compare(x[0],y[0]));  // sort the intervals on the basis of 1st element of an array

        List<int[]> ans=new ArrayList<>();   // make a list of type integer array

        int[] mergedInterval=intervals[0];   

        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];  // get the array at index i of intervals to compare with the mergedInterval
            if(interval[0]<=mergedInterval[1]){
                mergedInterval[1]=Math.max(mergedInterval[1],interval[1]);
            }else{
                ans.add(mergedInterval);
                mergedInterval=interval;
            }
        }

        ans.add(mergedInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}