import java.util.Scanner;
class reverse
{
    public static void main(String[] args)
    {
        int x,y,z=0;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt(); //234
        while(x>0)
        {
            y = x % 10; //234 % 10 = 4
            z = z*10+y; // 0 * 10 + 4
            x = x/10; // 234 = 234 / 10
        }
        System.out.println("The reverse of given number is: "+z);
    }
}