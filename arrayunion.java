import java.util.*;

public class arrayunion {

    static void printUnion(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (c[j] == a[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                c[k]=a[i];
                k++;
            }
        }
        for (int i = 0; i < b.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (c[j] == b[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                c[k]=b[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(c[i]+" ");
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

        printUnion(a, b);

        in.close();
    }
}