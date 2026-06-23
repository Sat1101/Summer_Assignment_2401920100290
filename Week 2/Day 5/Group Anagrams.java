class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> mp = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            s = String.valueOf(ch);
            if(mp.containsKey(s)) {
                mp.get(s).add(strs[i]);
            }else{
                mp.put(s, new ArrayList<>());
                mp.get(s).add(strs[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : mp.keySet()) {
            ans.add(mp.get(s));
        }
        return ans;
    }
}
