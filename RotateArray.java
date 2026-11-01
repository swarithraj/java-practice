import java.util.*;

public class RotateArray {

    static void rotateRight(int[] a, int k) {

        int n = a.length;

        if (n == 0) {
            return;
        }
        k = k % n;
        for (int i = 0; i < k; i++) {
             int last = a[n - 1];

            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }

            a[0] = last;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt();

        rotateRight(a, k);

        in.close();
    }
}