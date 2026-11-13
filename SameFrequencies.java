
import java.util.*;

public class SameFrequencies {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int count = map1.getOrDefault(arr1[i], 0);
            map1.put(arr1[i], count + 1);
        }

        for (int i = 0; i < n; i++) {
            int count = map2.getOrDefault(arr2[i], 0);
            map2.put(arr2[i], count + 1);
        }

        if (map1.equals(map2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}
