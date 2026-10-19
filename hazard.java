import java.util.*;
public class hazard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println("the number is hazard number");
        }
        else{
            System.out.println("the number is not a hazard number ");
        }
        in.close();

    }
}
