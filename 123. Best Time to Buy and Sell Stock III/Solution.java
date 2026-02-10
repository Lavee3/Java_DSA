class Solution {
    public int maxProfit(int[] prices) {
        int buy_1= Integer.MIN_VALUE;
        int sell_1=0;
        int buy_2= Integer.MIN_VALUE;
        int sell_2=0;
         
        for(int price : prices){
            buy_1=Math.max(buy_1,-price);
            sell_1=Math.max(sell_1,buy_1+price);

            buy_2=Math.max(buy_2,sell_1-price);
            sell_2=Math.max(sell_2,buy_2+price);
        }
        return sell_2;
    }
}
