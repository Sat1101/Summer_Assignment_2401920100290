class Solution {
    public int firstUniqChar(String s) {
        int[] temp=new int[26];
        char[] chars=s.toCharArray();
        for(char c:chars){
            temp[c-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(temp[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
