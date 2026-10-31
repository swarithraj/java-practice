import java.util.*;

public class stockprofit {

    static void maxProfit(int[] a) {

        int maxprofit = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                
                int profit = a[j] - a[i];

                
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }

        System.out.println(maxprofit);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        maxProfit(a);

        in.close();
    }
}
