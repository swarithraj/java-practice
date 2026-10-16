import java.util.*;
public class amstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int temp=n;
        int sum=0;
       if(n<0){
        System.out.println("give a non negitive integer");
       }
       else{
        if (n==0) {
            count=1;
            
        }
       }
        while(n>0){
            count++;
            n=n/10;
        }
        n=temp;
        while (n>0) 
        {
            int d=n%10;
            int power=(int) Math.pow(d, count);
            sum+=power;
            n=n/10;    
        }
        if(sum==temp){
            System.out.println("this number is armstrong number ");
        }
        else{
            System.out.println("this number not a armstrong ");
        }
        in.close();
    }    
}
