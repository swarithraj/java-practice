import java.util.*;

public class maxproduct {

    static void findMaxProduct(int[] a) {

        
        long maxproduct = (long) a[0] * a[1];

        for (int i = 0; i < a.length; i++) {

            
            for (int j = i + 1; j < a.length; j++) {

                long product = (long) a[i] * a[j];

                
                if (product > maxproduct) {
                    maxproduct = product;
                }
            }
        }

        System.out.println(maxproduct);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (n >= 2) {
            findMaxProduct(a);
        }

        in.close();
    }
}