import java.util.*;

public class EquilibriumIndex {

    static void findEquilibrium(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int rightsum = 0;
            int leftsum = 0;
            for (int j = i + 1; j < a.length; j++) {
                rightsum += a[j];
            }
            for (int k = 0; k < i; k++) {
                leftsum += a[k];
            }
            if (rightsum == leftsum) {
                System.out.println(i);
                return;
            }

        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        findEquilibrium(a);

        in.close();
    }
}