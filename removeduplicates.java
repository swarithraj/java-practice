import java.util.*;

public class removeduplicates {

    static void printUnique(int[] a) {

        if (a.length == 0) {
            return;
        }

        System.out.print(a[0] + " ");

        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[i-1]){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        printUnique(a);
        in.close();
    }
}