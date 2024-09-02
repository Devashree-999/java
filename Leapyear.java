import java.util.Scanner;
public class Leapyear{
    //leap year condition
    //1. year divisible by 4, 2.divisible by 400, 3.but not divisible by 100
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        //if((year%4==0 && year%100!=0) || (year%400==0))
        if(year%4==0&&year%400==0){
            System.out.println("leap year");
        }
        else if(year%100!=0){
            System.out.println("leap year");
        }
        else
        System.out.println("not a leap year");
    }
}