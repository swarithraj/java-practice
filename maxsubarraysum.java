import java.util.*;

public class maxsubarraysum {

    static void findMaxSum(int[] a) {
        int maxsum=a[0];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (n > 0) {
            findMaxSum(a);
        }

        in.close();
    }
}