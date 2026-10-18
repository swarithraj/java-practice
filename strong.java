import java.util.*;
public class strong {
   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int temp=n;
    int sum=0;
    while (n>0) {
        int d=n%10;
        int fact=1;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
    }
    if(temp==sum){
        System.out.println("the number is strong number ");
    }
    else{
        System.out.println("the number is not a strong number");
    }
in.close();  
} 

}
