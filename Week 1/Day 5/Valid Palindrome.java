class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }
        
        int f = 0;
        int l = sb.length()-1;
        while(f <= l) {
            if(sb.charAt(f) != sb.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
}
