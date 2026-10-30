import java.util.*;

public class twosum {

    static void findTwoSum(int[] a, int target) {

        // Write your logic here
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println(i+" "+j);
                    return ;
                }
            }
        }
        System.out.println("-1-1");
        // Hint:
        // Use one loop to select the first element
        // Use another loop to check elements after it
        // If their sum equals target, print both indexes
        // Then return to stop the method

        // If no pair is found, print -1 -1
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int target = in.nextInt();

        findTwoSum(a, target);

        in.close();
    }
}