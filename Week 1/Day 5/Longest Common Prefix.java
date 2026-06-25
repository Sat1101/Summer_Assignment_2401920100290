class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        String fs = strs[0];
        for(int i=0; i<fs.length(); i++) {
            
            char ch = fs.charAt(i);
            boolean can = true;
            for(int j=0; j<strs.length; j++) {
                String str = strs[j];
                if(i >= str.length() || str.charAt(i) != ch) { 
                    can = false;
                    break;
                }
            }
            if(can) {
                sb.append(ch);
            }else{
                break;
            }
        }
        return sb.toString();
    }
}
