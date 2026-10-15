import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//12
        int sum=0;
        while(n>0){
           int d=n%10;//2;
            sum+=d;
            n=n/10;
        }
        System.out.println(sum);
        in.close();
    }
}
