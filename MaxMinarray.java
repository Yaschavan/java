import java.util.Scanner;
class MaxMinarray
{
	void min(int[] f)
	{
		int min=f[0];
		for(int i=0;i<f.length;i++)
		{
			if(f[i]<min)
			min=f[i];
		}
		System.out.println("The minimum value of Array is : "+min);
	}

	void max(int[] f)
	{
		int max=0;
		for(int i=0;i<f.length;i++)
		{
			if(f[i]>max)
			max=f[i];
		}
		System.out.println("The maximum value of Array is : "+max);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Array : ");
		int y=sc.nextInt();
		int[] a=new int[y];
		MaxMinarray m=new MaxMinarray();
		System.out.println("Enter "+y+" elements of Array : ");
		for(int i=0;i<y;i++)
		{
			System.out.println("Enter value of "+i+" index : ");
			a[i]=sc.nextInt();
		}

		System.out.println("Printing Array : ");
		for(int i=0;i<y;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		m.max(a);
		m.min(a);
	}
}