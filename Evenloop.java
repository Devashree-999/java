import java.util.Scanner;
public class Evenloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        System.out.println("even numbers from 1 to n are:");
        for(int i=1;i<=n;i=i++){
            if(i%2==0)
            System.out.println(i);
        }

        
    }
}