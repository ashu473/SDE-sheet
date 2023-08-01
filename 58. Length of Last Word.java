class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] tmp=s.split(" ");
        int n=tmp.length;
        return tmp[n-1].length();
    }
}