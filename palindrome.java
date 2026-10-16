import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int d=0;
        while (n>0) {
            int num=n%10;
            d=(d*10)+num;
            n=n/10;
        }
        if(temp==d){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome" );
        }
        in.close();
    }
}
