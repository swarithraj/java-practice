import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//123
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        in.close();
    }
    
}