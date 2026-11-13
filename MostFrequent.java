
import java.util.*;

public class MostFrequent {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int count = map.getOrDefault(arr[i], 0);
            map.put(arr[i],count+1);
           
        }

        int maxFreq = 0;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int frequency = map.get(arr[i]);

            if (frequency > maxFreq) {
                maxFreq=frequency;
                answer=arr[i];
               
            } else if (frequency == maxFreq) {
                answer=Math.min(answer,arr[i]);
            
            }
        }

        System.out.println(answer);
        in.close();
    }
}
