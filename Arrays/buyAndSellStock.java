import java.util.*;

public class buyAndSellStock {
    public static int calcMaxProfit(int prices[]){
        // Profit = SP - BP
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value: ");
            prices[i]=sc.nextInt();
        }

        int maxProfit=calcMaxProfit(prices);
        System.out.println("Max Profit is: " + maxProfit);
        sc.close();
    }
}
