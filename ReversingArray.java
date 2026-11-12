
import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int left = 0;
        int right = n - 1;
        while(left<right){
            arr[left]=arr[left]+arr[right];
            arr[right]=arr[left]-arr[right];
            arr[left]=arr[left]-arr[right];
            left++;
            right--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
