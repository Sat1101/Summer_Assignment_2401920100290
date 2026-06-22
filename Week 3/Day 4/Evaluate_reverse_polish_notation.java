class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        for(int i=0; i<tokens.length; i++) {
            String s = tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                if(num.size() >= 2) {
                    int n1 = num.pop();
                    int n2 = num.pop();
                    if(s.equals("+")) {
                      num.push(n2+n1);
                    }else if(s.equals("-")) {
                        num.push(n2-n1);
                    }else if(s.equals("*")) {
                        num.push(n2*n1);
                    }else{
                        num.push(n2/n1);
                    }
                }
            }else{
                    num.push(Integer.parseInt(s));
                }
            }
        return num.pop();
    }
}
