import java.util.*;
public class sorting {
    static void sort(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int []a=new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }
        in.close();
    }
}