import java.util.*;

public class Sorted {

    static void checkSorted(int[] a) {

        boolean sorted = true;
        for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    sorted=false;
                    break ;
            }
        }
        if(sorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }
        // Compare neighboring elements.
        // If an earlier element is greater than the next,
        // the array is not sorted.

        // Print "Sorted" or "Not Sorted".
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        checkSorted(a);

        in.close();
    }
}