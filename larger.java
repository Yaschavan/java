import java.util.Scanner;
class larger
{
    public static void main(String[] args)
    {
        int x,y,z; //Declare three variable
        System.out.println("Enter three number: ");
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt(); //Taking value from user
        y = sc.nextInt();
        z = sc.nextInt();
        if((x>y) && (x>z))
        System.out.println("The greater number is: "+x);
        else if((y>x) && (y>z))
        System.out.println("The greater number is: "+y);
        else
        System.out.println("The greater number is: "+z);
    }
}