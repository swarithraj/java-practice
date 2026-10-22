import java.util.*;

public class smallarray {

    static int smallest(int[] a) {

        int min = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
 
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Smallest element = " + smallest(a));

        in.close();
    }
} 
