import java.util.Scanner;
public class Pattern_20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        
            for(int k=1;k<i;k++){
            
        System.out.print(" ");
        }
         for(int j=1;j<=n-i+1;j++){
 System.out.print(j);
        }
        System.out.println();
        }
        
    }
}   