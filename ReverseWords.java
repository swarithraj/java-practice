import java.util.*;

public class ReverseWords {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i]);

            if (i > 0) {
                System.out.print(" ");
            }
        }

        in.close();
    }
}