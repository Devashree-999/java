import java.util.Scanner;
public class Pattern_17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        
            for(int k=1;k<=n-i+1;k++){
            
        System.out.print(" ");
        }
         for(int j=1;j<=i;j++){
 System.out.print(1+n-j);
        }
        System.out.println();
        }
        
    }
}   