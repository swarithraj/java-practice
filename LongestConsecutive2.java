import java.util.*;

public class LongestConsecutive2 {
    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };

        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}