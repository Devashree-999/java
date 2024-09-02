public class Logical
{
    public static void main(String[] args)
    {
        int a=20,b=17,c=20;
        
        System.out.println(a>b&&c<b);//true and false
        System.out.println(c<b||a>b);//false or true
        System.out.println(a>=c&&a>b);//true and true
        System.out.println(c<=b||a>=c);//false or true
        System.out.println(!(a==c));//true not
        
       
    }
}