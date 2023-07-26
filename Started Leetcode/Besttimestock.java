import java.util.Scanner;

public class Besttimestock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] prices = {7,1,5,3,6,4};

        for(int i = 0; i<prices.length; i++){
            int days = prices[i];
            for (int j = 1; j<prices.length; j++){
                days = prices[i] + prices[j];
            }
        }
    }
    
}
