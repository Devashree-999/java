import java.util.Scanner;
public class Sumofwholenoloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of whole number between 0 to n:" +sum);
        

        
    }
}