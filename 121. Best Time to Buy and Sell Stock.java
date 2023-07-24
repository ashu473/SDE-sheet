class Solution {
    public int maxProfit(int[] prices) {   


       
      /* 200/212 cases passed 
        int n=prices.length;
        int maxP=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]>prices[i]){
                    maxP=Math.max(maxP,prices[j]-prices[i]);
                }
            }
        }
        return maxP;
        */

        int min=prices[0];
        int maxp=0;
        for(int i=1;i<prices.length;i++){   
            int diff=prices[i]-min;
            maxp=Math.max(diff,maxp);       // max difference
            min=Math.min(min,prices[i]);    // track the min value
        }
        return maxp;
    }
}