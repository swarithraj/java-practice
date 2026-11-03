import java.util.*;

public class CountSubarrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt();
        int count = 0;
            for(int i=0;i<a.length;i++){
                int sum=0;
                for(int j=i;j<a.length;j++){
                    sum+=a[j];
                    if(sum==k){
                    count++;
                }
                }
            }
        System.out.println(count);
        in.close();
    }
}