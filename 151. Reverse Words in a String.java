class Solution {
    public String reverseWords(String s) {
        s=s.trim();  // remove trailing and leading white spaces
        String str[]=s.split("\\s+"); //Each part of the string between two consecutive whitespace occurrences will be separated and stored in the array str.
        StringBuilder sb=new StringBuilder();
       
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i!=0)
                sb.append(" ");
        }
        return sb.toString();
    }
}
