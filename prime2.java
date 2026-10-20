import java.util.Scanner;

public class prime2{
    static boolean isprime(int n){
        int i=2;
        int count=0;
        while (i<n) {
            if(n%i==0){
                count++;
                
            }
            i++;
        }
        if (n<2) {
            return false;   
        }
        else if (count==0){
          return true;
        }
        else{
        return false;
        }
       
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(isprime(n)){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not a prime");
        }
        in.close();
    }

}