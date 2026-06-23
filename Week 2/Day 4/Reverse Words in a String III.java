class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<words.length; i++) {
             String str = words[i];
             StringBuilder revWords = new StringBuilder(str).reverse();
             sb.append(revWords);
             if(i != words.length-1) {
             sb.append(" ");
             }
        }
       return sb.toString();
    }
}
