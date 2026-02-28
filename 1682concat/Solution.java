class Solution {
    public int concatenatedBinary(int n) {

        int mod = 1000000007;
        long result = 0;

        for(int i = 1; i <= n; i++){

            int bits = Integer.toBinaryString(i).length();

            result = ((result << bits) + i) % mod;
        }

        return (int) result;
    }
}
