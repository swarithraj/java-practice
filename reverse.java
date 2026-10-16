import java.util.*;
public class reverse {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();//123
        int d=0;
        while (n>0){
            int num=n%10;//3
            n=n/10;//123/10=12
            d=(d*10)+num;
        }
        System.out.println(d);
        in.close();
    }
}