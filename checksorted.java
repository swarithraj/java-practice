import java.util.*;

public class checksorted {

    static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                 return false;
                }
               
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (isSorted(a)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        in.close();
    }
}