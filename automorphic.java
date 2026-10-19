import java.util.*;
public class automorphic {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int temp=n;
            int divisor=1;
            while (n>0) {
                n=n/10;
                divisor=divisor*10;
            }
           int s=(int)Math.pow(temp,2);
           if(s%divisor==temp){
            System.out.println("the number is automorphic");
           }
           else{
            System.out.println("the number is not automorphic");
           }
        in.close();
    }
}
