import java.util.*;

public class majorityelement {

    static int majorityElement(int[] a) {

        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;

                }
            }
            if(count>a.length/2){
                return a[i];
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(majorityElement(a));

        in.close();
    }
}