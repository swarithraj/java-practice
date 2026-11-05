import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char current = str.charAt(right);

            while (set.contains(current)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(current);

            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }

        System.out.println(maxLength);

        in.close();
    }
}