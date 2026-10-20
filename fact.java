import java.util.*;
public class fact {
    static int factorial(int n){
        int i=n;//5
        int m=1;//5
        while (i>0) {
            m=m*i;//1*5=5
            i--;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(factorial(n));
        in.close();

    }
}
