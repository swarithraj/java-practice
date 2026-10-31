import java.util.*;

public class arrayintersection {

    static void findIntersection(int[] a, int[] b) {
        int c[] = new int[Math.min(a.length, b.length)];
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            boolean common = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    common = true;
                    break; 
                }
            }

            if (common) {

                boolean found = false;

                for (int j = 0; j < k; j++) {

                    if (a[i] == c[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    c[k] = a[i];
                    k++;      
                }
            }
        }

        if (k == 0) {
            System.out.println("No common elements");
        }

        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        findIntersection(a, b);

        in.close();
    }
}