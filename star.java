import java.util.Scanner;
class star
{
    public static void main(String[] args)
    {
        for(int i=5; i >= 1; i--) //5>=1 
        {
            if(i == 2)
            {
                continue;
            }
            for(int j=1; j <= i; j++) //1<=5 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}