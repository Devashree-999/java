import java.util.Scanner;
public class Scannerinput{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter byte value");
    byte b=sc.nextByte();
    System.out.println("enter short value");
    short s=sc.nextShort();
    System.out.println("enter int value");
    int i=sc.nextInt();
    System.out.println("enter long value");
    long l=sc.nextLong();
    System.out.println(b);
     System.out.println(s);
      System.out.println(i);
       System.out.println(l);
    }
}