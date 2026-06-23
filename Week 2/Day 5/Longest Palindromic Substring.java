class Solution {
    public String longestPalindrome(String s) {
        int maxLen = Integer.MIN_VALUE;
        int st = 0;
        int[][] dp = new int[s.length()+1][s.length()+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if(solve(i, j, s, dp)) {
                    if(maxLen < j-i+1) {
                        maxLen = j-i+1;
                        st = i;
                    }
                }
            }
        }
        return s.substring(st, st+maxLen);
    }
     public boolean solve(int i, int j, String s, int[][] dp) {
        if(i >= j) {
            dp[i][j] = 1;
            return true;
        }
        if(dp[i][j] != -1) {
            return dp[i][j] == 1;
        }
        if(s.charAt(i) == s.charAt(j)) {
            boolean ans =  solve(i+1, j-1, s, dp);
            if(ans) {
                dp[i][j] = 1;
            }else{
                dp[i][j] = 0;
            }
            return ans;
        }
          dp[i][j] = 0;
            return false;
        
    }
}
