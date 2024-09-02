import java.util.Scanner;
public class Multiple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int m;
        System.out.println("multiple of 2 upto n");
        for(int i=1;i<=n;i++){
            System.out.println("2*"+i+"="+2*i);
        }

        
    }
}