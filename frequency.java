import java.util.*;

public class frequency {

    static int frequencynum(int[] a, int target) {
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int target = in.nextInt();

        System.out.println("Frequency = " + frequencynum(a, target));

        in.close();
    }
}