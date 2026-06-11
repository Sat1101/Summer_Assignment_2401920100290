class Solution {
    public int lengthOfLongestSubstring(String s) {
        int beg=0;
        int end=0;
        int max_length=0;
        List<Character> list = new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(beg)));
                beg++;
            }
        }
        return max_length;
    }
}
