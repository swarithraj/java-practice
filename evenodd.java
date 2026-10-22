import java.util.*;

public class evenodd {
    static void evenoddcount(int []a){
        int even=0;
        int odd=0;
       for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
       }
        System.out.println(even);
        System.out.println(odd);

    }
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        evenoddcount(a);

        in.close();
    }
}