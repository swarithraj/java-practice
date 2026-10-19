import java.util.*;
public class perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("this is perfect number");
        }
        else{
            System.out.println("the number is not a perfect number");
        }
        in.close();
    }
}