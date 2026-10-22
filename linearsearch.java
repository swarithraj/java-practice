import java.util.*;

public class linearsearch {

    static int linearSearch(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int target = in.nextInt();

        int result = linearSearch(a, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }

        in.close();
    }
}