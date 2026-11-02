import java.util.*;

public class ArrayLeaders {

    static void findLeaders(int[] a) {

        for(int i=0;i<a.length;i++){//16 17 4 3 5 2  a[0]=16
            boolean found=true;
            for(int j=i+1;j<a.length;j++){//
                if(a[j]>a[i]){
                    found=false;
                    break;
                }
            }
            if(found){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        findLeaders(a);

        in.close();
    }
}