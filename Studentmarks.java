import java.util.Scanner;

class Studentmarks
{
 void total(int[] a)
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.print("The Total marks of Student is "+sum);
}

void average(int[] a)
{
int avg=0;
for(int i=0;i<a.length;i++)
{
avg=avg+a[i];
}
System.out.println("The Average of Student is  "+avg/5);
}

void result(int[] a)
{
int count=0;
for(int i=0;i<a.length;i++)
{
if(a[i]<40)
count++;
}
if(count>=1)
System.out.println("The Result of Student Is FAIL ");
else
System.out.println("The Result of Student is PASS "); 

}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Studentmarks c=new Studentmarks();
int[] m1={22,35,50,40,45};
int[] m2={60,56,61,82,92};
int[] m3={37,50,78,36,45};
int[] m4={53,35,60,60,43};
int[] m5={35,65,40,81,45};
System.out.println("Student1  Five Subject Marks:");
for(int i=0;i<m1.length;i++)
{
System.out.print(" "+m1[i]);
}

System.out.println("\n Student2  Five Subject Marks:");
for(int i=0;i<m2.length;i++)
{
System.out.print(" "+m2[i]);
}

System.out.println("\n Student3  Five Subject Marks:");
for(int i=0;i<m3.length;i++)
{
System.out.print(" "+m3[i]);
}

System.out.println(" \n Student4  Five Subject Marks:");
for(int i=0;i<m4.length;i++)
{
System.out.print(" "+m4[i]);
}

System.out.println("\n Student5  Five Subject Marks:");
for(int i=0;i<m5.length;i++)
{
System.out.print(" "+m5[i]);
}

System.out.println("\n Total Marks of Student \n "); 
System.out.println("\n Student 1 ");
c.total(m1);
System.out.println("\n Student 2  ");
c.total(m2);
System.out.println("\n Student 3 ");
c.total(m3);
System.out.println("\n Student 4 ");
c.total(m4);
System.out.println("\n Student 5 ");
c.total(m5);

System.out.println("Average of Student \n"); 
System.out.println("Student 1.");
c.average(m1);
System.out.println("Student 2.");
c.average(m2);
System.out.println("Student 3.");
c.average(m3);
System.out.println("Student 4.");
c.average(m4);
System.out.println("Student 5.");
c.average(m5);

System.out.println(" RESULT of Student \n"); 
System.out.println("\n Student 1.  ");
c.result(m1);
System.out.println("\n Student 2.  ");
c.result(m2);
System.out.println("\n Student 3.  ");
c.result(m3);
System.out.println("\n Student 4.  ");
c.result(m4);
System.out.println("\n Student 5.  ");
c.result(m5);
}
}