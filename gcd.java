import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number ");
        int n = in.nextInt();
        System.out.println("enter the second number ");
        int m = in.nextInt();
        int gcdivisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                gcdivisor = i;
            }
        }
        System.out.println(gcdivisor);
        in.close();
    }
}
