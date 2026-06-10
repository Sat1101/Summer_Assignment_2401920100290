class Solution {
    public boolean isAnagram(String s, String t) {
        int a= s.length();
        int b= t.length();
        if (a!=b){
           return false;
        }
        else{
           int count[]= new int[26];
           for(int i=0;i<a;i++){
            count[s.charAt(i)-'a']++;
           }
           for(int i=0;i<b;i++){
            count[t.charAt(i)-'a']--;
           }
           for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
           }
           return true;
        }
        
    }
}


