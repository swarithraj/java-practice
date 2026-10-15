//find the biggest number in the given number 
// given an integer find the biggest digit present in the number 
import java.util.*;
public class biggest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        int s=0;
        while (num>0) {
            int d=num%10;
            if(d>s){
                s=d;
            }
         num=num/10;
        }
            System.out.println(s);
        in.close();
    }
}

