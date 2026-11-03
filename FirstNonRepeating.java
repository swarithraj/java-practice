import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(a[i]);
                in.close();
                return ;
            }
        }
        System.out.println("-1");

        in.close();
    }
}