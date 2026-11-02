
import java.util.*;

public class MaxSumSubarray {

    static int maxSum(int[] a, int k) {

        int n = a.length;

       
        if (k <= 0 || k > n) {
            throw new IllegalArgumentException("Invalid k");
        }

        int sum = 0;

        
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        int maxSum = sum;

        
        for (int i = k; i < n; i++) {

            sum = sum + a[i] - a[i - k];
            

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt();

        System.out.println(maxSum(a, k));

        in.close();
    }
}
