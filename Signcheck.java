import java.util.Scanner;
public class Signcheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("number is positive");
        }
        else
        System.out.println("number is negative");
    }
}