class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n, n, "", list);
        return list;
    }
    public void solve(int open, int close, String s, List<String> list) {
    if(open == 0 && close == 0) {
    
         list.add(s);
       
       return;
    }
    if(open > 0) {
         solve(open-1, close, s+"(", list);
    }
    if(close > open) {
         solve(open, close-1, s+")",list);
    }
    }
}
