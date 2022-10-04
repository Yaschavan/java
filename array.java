import java.util.Scanner;
class array
{
void add(int[][] x,int[][] y) 
{
int [][] z=new int[2][2];
System.out.println("Addtion of Two Matrix :");
for(int i=0;i<x.length;i++)
{
for(int j=0;j<y.length;j++)
{
z[i][j]=x[i][j]+y[i][j];
}
}
for(int i=0;i<z.length;i++)
{
for(int j=0;j<z.length;j++)
{
System.out.print(" "+z[i][j]);
}
System.out.println();
}
}

void transpose(int[][] a,int[][] b)
{
Scanner sc=new Scanner(System.in);
int[][] c=new int[2][2];
int y;
System.out.println("Enter your choice for Transponse of Matrix 1 or 2:"); 
y=sc.nextInt();
if(y==1)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
c[i][j]=a[j][i];
}
}
}
else
{
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b.length;j++)
{
c[i][j]=b[j][i];
}
}
}

System.out.println("Tranpose of Martix : ");
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}

void multiply(int[][] a,int[][] b)
{
int[][] c=new int[2][2];
if(a.length==b.length)
{
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<2;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
}
else
{
System.out.println("Mulitply of array is not possible .");
}
System.out.println("Multiply of array is : ");
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}
public static void main(String[] args)
{
array c=new array();
Scanner sc=new Scanner(System.in);

System.out.println("Enter  First array  ");
int[][] a=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println("Enter value for array");
a[i][j]=sc.nextInt();
}
}
System.out.println("Your first array: ");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(" "+a[i][j]);
}
System.out.println();
}
System.out.println(" Enter  Second array  ");
int[][] b=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println("Enter values for array ");
b[i][j]=sc.nextInt();
}
}
System.out.println("Your Second array: ");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(" "+b[i][j]);
}
System.out.println();
}


int y;
System.out.println("1. Addtion of Matrix .");
System.out.println("2. Transpose of Matrix .");
System.out.println("3.  Multiply  of Matrix .");
System.out.println("Enter  Your Choice: ");
y=sc.nextInt();
switch(y)
{
case 1:
c.add(a,b);
break;
case 2:
c.transpose(a,b);
break;
case 3:
c.multiply(a,b);
break;
default:
System.out.println("Error!!");
break;
}
}
}