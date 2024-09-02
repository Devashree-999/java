import java.util.Scanner;
public class Month{
    public class void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter chpice");
        char month=sc().charAt(0);
        switch(month){
            case 'J':
             System.out.println("january");
             break;
            case 'F':
             System.out.println("february");
             break;
             case 'M':
             System.out.println("march");
             break;
             case 'A':
             System.out.println("april");
             break;
             case 'm':
             System.out.println("may");
             break;
             case 'j':
             System.out.println("june");
             break;
             case 'y':
             System.out.println("july");
             break;
             case 'a':
             System.out.println("august");
             break;
             case 'S':
             System.out.println("september");
             break;
             case 'O':
             System.out.println("october");
             break;
             case 'N':
             System.out.println("november");
             break;
             case 'D':
             System.out.println("december");
             break;
             default:
                System.out.println("wrong choice");

        }
        
    }
}