import java.util.Scanner;
class Sequence2
{
    public static void main(String[] args)
    {
        int m=1;
        System.out.print("  "+m);
        for(int i=0; i<=10; i++)
        {
            Scanner sc=new Scanner(System.in);
            m = m * 2;
            System.out.print("  "+m);
            
        }
    }
}