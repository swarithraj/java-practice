
import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
     
        int answer = -1;
        

        for (int i = 0; i < n; i++) {

            
            if(set.contains(arr[i])){
                answer=arr[i];

                break;
            }
            else{
                set.add(arr[i]);
            }
        }

        System.out.println(answer);

        in.close();
    }
}
