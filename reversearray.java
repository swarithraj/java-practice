import java.util.Scanner;

public class reversearray {

    static void reverseArray(int[] a) {

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = in.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Reversed array:");
        reverseArray(a);

        in.close();
    }
}