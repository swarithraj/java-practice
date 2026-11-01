import java.util.*;

public class SecondLargest {

    static void findSecondLargest(int[] a) {
            int largest=a[0];
            int SecondLargest=0;
            boolean found=false;
            for(int i=0;i<a.length;i++){
                if(a[i]>largest){
                    largest=a[i];
                }
            }
            for(int i=0;i<a.length;i++){
                if(a[i]<largest){
                if(!found||a[i]>SecondLargest){
                    SecondLargest=a[i];
                    found=true;
                }
            }
            }
            if(found){
            System.out.println(SecondLargest);
            }
            else{
                System.out.println(-1);
            }
}

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        findSecondLargest(a);

        in.close();
    }
}