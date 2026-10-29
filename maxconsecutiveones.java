import java.util.*;

public class maxconsecutiveones {

    static int maxConsecutiveOnes(int[] a) {
        int count=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){//1100111 
                count++;//1 2 0 0
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(maxConsecutiveOnes(a));

        in.close();
    }
}