import java.util.Scanner;
class Sequence3
{
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        int x=0, y=1, z;
        System.out.print("  "+x);
        System.out.print("  "+y);
        while(x < 10)
        {
            z = x + y;
            x = y;
            y = z;
            System.out.print("  "+z);
            
        }
    }
}