import java.util.Scanner;
class sum
{
	void add(int x, int y)
	{
		System.out.println("Sum of "+x+" + "+y+" is : "+(x+y));
	}
	void sub(int x, int y)
	{
		System.out.println("Subtraction of "+x+" - "+y+" is : "+(x-y));
	}
	void mul(int x, int y)
	{
		System.out.println("Multiplication of "+x+" * "+y+" is : "+(x*y));
	}
	public static void main(String[] args)
	{
		sum s=new sum();
		Scanner sc=new Scanner(System.in);
		char c='y';
		do
		{
			int a1, b1;
			System.out.println("Enter first number : ");
			a1=sc.nextInt();
			System.out.println("Enter second number : ");
			b1=sc.nextInt();
			s.add(a1,b1);
			s.sub(a1,b1);
			s.mul(a1,b1);
			System.out.println("Enter 'Y' to continue again : ");
			c=sc.next().charAt(0);
			c=Character.toUpperCase(c);
		}while(c=='Y');
	}
}