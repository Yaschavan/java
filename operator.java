import java.util.Scanner;
class Operators
{
public static void main(String[] args)
{
int num1,num2;
System.out.println("Arithmetics Opertion");
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number: ");
num1=sc.nextInt();
System.out.println("Enter Second number: ");
num2=sc.nextInt();

int y1=num1+num2; 
int y2=num1-num2;
int y3=num1*num2;
int y4=num1/num2;
int y5=num1%num2;
System.out.println("Addition :"+num1+"+"+num2 +"="+y1);
System.out.println("Subtraction: :"+num1+"-"+num2 +"="+y2);
System.out.println("Multiply :"+num1+"*"+num2 +"="+y3);
System.out.println("Division :"+num1+"/"+num2 +"="+y4);
System.out.println("Modulus :"+num1+"%"+num2 +"="+y5);

int x,y;
System.out.println("Relational Operator");
System.out.println("Enter First number: ");
x=sc.nextInt();
System.out.println("Enter Second number: ");
y=sc.nextInt();
if(x>y)
System.out.println(x+" is Greater");
else if(x<y)
System.out.println(y+" is Greater");
else if(x==y)
System.out.println("Both are equal .");
else if(x!=y)
System.out.println("Both are not equal ."); 


System.out.println("Unary Opertion");
int m,n;
System.out.println("Enter First number: ");
m=sc.nextInt();
System.out.println("Enter second  number: ");
n=sc.nextInt();
System.out.println("post Increment of first number: "+(m++));//post Increment
System.out.println("pre Decrement of second number:"+(--n));


int a,b;
System.out.println("Ternary Operator");
System.out.println("Enter First number: ");
a=sc.nextInt();
System.out.println("Enter second  number: ");
b=sc.nextInt();
System.out.println(a>b?"First number is greater":"Second Number is greater");




}
}