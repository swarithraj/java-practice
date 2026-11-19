
import java.util.Scanner;

class BalancedBrackets {

    boolean isBalanced(String str) {

        char[] arr = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                top++;
                arr[top] = ch;
            }

            else if (ch == '}' || ch == ']' || ch == ')') {

                if (top == -1) {
                    return false;
                }

                if (ch == ')' && arr[top] != '(') {
                    return false;
                }
                else if (ch == '}' && arr[top] != '{') {
                    return false;
                }
                else if (ch == ']' && arr[top] != '[') {
                    return false;
                }
                top--;
            }
        }

        return top == -1;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brackets:");
        String str = sc.nextLine();

        BalancedBrackets obj = new BalancedBrackets();

        System.out.println(obj.isBalanced(str));

        sc.close();
    }
}
