import java.util.Scanner;
public class Divisibleloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1 and n2");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("numbers divisible by 2 and 7 b/w n1 to n2 are:");
        for(int i=n1;i<=n2;i++){
            if(i%2==0&&i%7==0)
            System.out.println(i);
        }

        
    }
}