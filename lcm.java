import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int i=Math.max(n, m);
        while(true){
            if(i%n==0 && i%m==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        in.close();
    }
}
