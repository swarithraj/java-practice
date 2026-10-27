import java.util.*;

public class missingnumber {

    static int findMissing(int[] a, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Missing number = " + findMissing(a, n));

        in.close();
    }
}