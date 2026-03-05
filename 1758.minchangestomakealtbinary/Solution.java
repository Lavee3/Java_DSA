public class Solution {
    public int minOperations(String s) {
        int current = 0, count1 = 0;
        for (char c : s.toCharArray()) {
            if (c - '0' != current) {
                count1++;
            }
            current ^= 1;
        }

        currrent = 1;
        int count2 = 0;
        for (char c : s.toCharArray()) {
            if (c - '0' != current) {
                count2++;
            }
            current ^= 1;
        }

        return Math.min(count1, count2);
    }
}
