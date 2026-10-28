import java.util.*;

public class rotateright {

    static void rotateRight(int[] a) {
        if (a.length <= 1) {
            return;
        }

        int last = a[a.length - 1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }

        a[0] = last;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        rotateRight(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        in.close();
    }
}