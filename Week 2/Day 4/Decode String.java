class Solution {
    public String decodeString(String s) {
        Stack<Character> sc = new Stack<>();
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder("");
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int no = 0;
                while(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    no = no*10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                st.push(no);
            }else if(s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder("");
                while(sc.peek() != '[') {
                     sb.insert(0, sc.peek());
                     sc.pop();
                }
                sc.pop();
                
                int n = st.pop();
                StringBuilder ex = new StringBuilder("");
                for(int j=0; j<n; j++) {
                    ex.append(sb);
                }
                if(!sc.isEmpty()) {
                  for(int j=0; j<ex.length(); j++) {
                     sc.push(ex.charAt(j));
                  }
                }else{
                    ans.append(ex);
                }
            }else{
                sc.push(s.charAt(i));
            }
        }
        if(!sc.isEmpty()) {
            StringBuilder at = new StringBuilder("");
           while(!sc.isEmpty()) {
             at.insert(0, sc.peek());
             sc.pop();
           }
           ans.append(at);
        }
        return ans.toString();
    }
}
