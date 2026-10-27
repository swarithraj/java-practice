import java.util.*;

public class movezeros {

    static void moveZeros(int[] a) {
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        while (index < a.length) {
            a[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        moveZeros(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        in.close();
    }
}