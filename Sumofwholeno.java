import java.util.Scanner;
public class Sumofwholeno{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int sum;
        sum=n*(n+1)/2;
        System.out.println("sum of whole number between 0 to n:" +sum);
        

        
    }
}