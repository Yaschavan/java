import java.util.Scanner;
class Sequence1
{
    public static void main(String[] args)
    {
        int a = 1, b = 3;
        System.out.print("  "+a);
        while(a < 10) //1 < 10
        {
            a = a + b; // 1 = 1 + 3
            System.out.print("  "+a);
        }
    }
}