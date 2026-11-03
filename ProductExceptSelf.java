import java.util.*;

public class ProductExceptSelf {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        int[] result = new int[n];

       
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int product = 1;

            for (int j = 0; j < n; j++) {

                if(i!=j){
                    product*=a[j];
                }
            }

            result[i]=product;
            
        }

        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        in.close();
    }
}