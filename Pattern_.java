public class Pattern_{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            int ascii=65;
            int ascii2=65+(i-1);
            for(int j=1;j<=(2*i-1);j++){
                if(i>j){
                    char ch=(char)ascii;
                    System.out.print(ch);
                    ascii++;
                }
                else{
                    char ch2=(char)ascii2;
                    System.out.print(ch2);
                    ascii2--;
                }
            }
            System.out.println();
        }
    }
}