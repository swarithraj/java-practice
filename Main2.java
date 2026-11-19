
import java.util.Scanner;

class ReverseString {

    String reverse(String str) {

        char[] arr = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            top++;
            arr[top] = str.charAt(i);
        }

        StringBuilder result = new StringBuilder();

        while (top != -1) {
            result.append(arr[top]);
            top--;
        }

        return result.toString();
    }
}

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        ReverseString obj = new ReverseString();

        System.out.println("Reversed string: " + obj.reverse(str));

        sc.close();
    }
}
