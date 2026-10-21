import java.util.Scanner;

public class bignum_array {
    static int biggestinarray(int []a){
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("enter the array size");
     int n=in.nextInt();
     int []a=new int[n];
     System.out.println("enter the elements of array");
     for(int i=0;i<n;i++){
        a[i]=in.nextInt();
     }
     System.out.println("the biggest num is "+biggestinarray(a));
     in.close();
    }
}