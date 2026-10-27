import java.util.*;

public class pairsum {

    static void findPairs(int[] a, int target) {
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == target) {
                    System.out.println(a[i] + " " + a[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int target = in.nextInt();

        findPairs(a, target);

        in.close();
    }
}