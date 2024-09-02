import java.util.Scanner;
public class Calci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter choice");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
            int add=a+b;
             System.out.println(add);
             break;
            case '-':
                int sub=a-b;
             System.out.println(sub);
             break;
             case '*':
                int mul=a*b;
                System.out.println(mul);
                break;
             case '/':
                int div=a/b;
             System.out.println(div);
             break;
             case '%':
                int mod=a%b;
             System.out.println(mod);
             break;
             default:
                System.out.println("wrong choice");

        }
        
    }
}