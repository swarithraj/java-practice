
import java.util.*;

public class RangeSumQuery {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] prefix = new int[n];
        if (n > 0) {
            prefix[0] = arr[0];
        }
        for (int i = 1; i < n ; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int left = in.nextInt();
        int right = in.nextInt();
        int sum = 0;
        if (left == 0) {
            sum = prefix[right];
        } else {
            sum = prefix[right] - prefix[left - 1];
        }
        System.out.println(sum);

        in.close();
    }
}
