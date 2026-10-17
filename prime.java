import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        if(n==2){
           count=2;
        }
        else{
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
       
            }  
    } 
}
        if(count==2){
            System.out.println("the number given is prime ");
        }     
        else{
            System.out.println("the number given is not a prime ");
        }
        in.close();
    }
}

