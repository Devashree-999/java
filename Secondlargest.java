import java.util.Scanner;
public class Secondlargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            if(b>c)
            System.out.println("b is second largest");
            else
            System.out.println("c is second largest");
        }
        else if(b>a&&b>c){
           if(a>c)
            System.out.println("a is second largest");
           else
            System.out.println("c is second largest");
        }
        else {
            if(a>b)
            System.out.println("a is second largest");
            else
            System.out.println("b is second largest");
        }
        
    }
}