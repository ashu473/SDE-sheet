class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiopQWERTYUIOP";
        String s2="asdfghjklASDFGHJKL";
        String s3="zxcvbnmZXCVBNM";

        List<String> typeablewords=new ArrayList<>();

        for(String i:words){   // traverse in the words[]
            char[] arr=i.toCharArray();  // convert the word in char Array, then call the canbetyped method to check the presence of each letter in the s1 or s2 or s3
            if(canbetyped(arr,s1) || canbetyped(arr,s2) || canbetyped(arr,s3)){
                typeablewords.add(i);
            }
        }
        return typeablewords.toArray(new String[0]);  // convert the list to array of String and then return 
    }

    public boolean canbetyped(char[] arr, String str){ // check wheater the word is in the s1 or s2 or s3
        for(char ch:arr){
            if(str.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}