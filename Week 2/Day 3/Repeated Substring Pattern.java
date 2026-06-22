class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d = s + s;
        String str = d.substring(1, d.length()-1);
        return str.contains(s);
    }
}
