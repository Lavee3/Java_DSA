import java.util.*;

class Solution {

    public int minimumDeletions(String s) {

        Stack<Integer> st = new Stack<>();

        int countB = 0;

        for (char c : s.toCharArray()) {

            if (c == 'b') {
                countB++;
                st.push(st.isEmpty() ? 0 : st.peek());
            } 
            else { 

                int prev = st.isEmpty() ? 0 : st.peek();

                int curr = Math.min(prev + 1, countB);

                st.push(curr);
            }
        }

        return st.isEmpty() ? 0 : st.peek();
    }
}
