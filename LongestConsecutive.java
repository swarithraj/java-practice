
import java.util.*;

public class LongestConsecutive {

    static int longestSequence(int[] a) {

        if (a.length == 0) {
            return 0;
        }

        Arrays.sort(a); 

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < a.length; i++) {

            if (a[i] == a[i - 1]) {
                // Ignore duplicate values
                continue;
            }

            if ((long) a[i] == (long) a[i - 1] + 1) {
                count++; 
            } else {
                count = 1; 
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(longestSequence(a));
        in.close();
    }
}
