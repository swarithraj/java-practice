import java.util.Scanner;

public class secondlarge {

    static int secondlargest(int[] a) {

        int largest = a[0];
        int secondlargestnum = 0;
        boolean foundSecond = false;

        for (int i = 1; i < a.length; i++) {

            if (a[i] > largest) {
                secondlargestnum = largest;
                largest = a[i];
                foundSecond = true;
            }

            else if (a[i] < largest &&
                    (!foundSecond || a[i] > secondlargestnum)) {

                secondlargestnum = a[i];
                foundSecond = true;
            }
        }

        if (!foundSecond) {
            throw new IllegalArgumentException("No second distinct element");
        }

        return secondlargestnum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Second largest = " + secondlargest(a));

        in.close();
    }
}