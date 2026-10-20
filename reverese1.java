import java.util.Scanner;

public class reverese1 {
    static int reveresing_num(int n){
        int i=0;
        while(n>0){//1234//123
            i=(n%10)+10*i;//
            n=n/10;//123
        }
        return i;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(reveresing_num(n));
        in.close();
    }
}
