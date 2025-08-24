public class BestTimeToBuyAndSellStock1 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 0){
            return 0;
        }

        for(int i = 0; i< prices.length-1; i++){
            int maxDiff = 0;
            for(int j = 1; j< prices.length-1; j++){
                int iprice = prices[i];
                int ijprice = prices[i+j];
                if(iprice < ijprice){
                    maxDiff = prices[i+j] - prices[i];
                    if(maxDiff > profit){
                        profit = maxDiff;
                    }
                }
            }

        }

        return profit;

    }

    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }
}
