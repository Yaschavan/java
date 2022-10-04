import java.util.Scanner;
class duplicate
{
  void fcheck(int[] h)
  {
    System.out.println("The Duplicate elements in the array are : ");
    for(int i=0;i<h.length;i++)
    {
      for(int j=i+1;j<h.length;j++)
      {
        if(h[i]==h[j])
        System.out.print(h[i]+" ");
      }  
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Array : ");
    int r=sc.nextInt();
    int[] a=new int[r];
    duplicate d=new duplicate();
    System.out.println("Enter "+r+" elements of Array  : ");
    for(int i = 0; i < r; i++)
    {
      System.out.println("Enter value of "+i+" index : ");
      a[i]=sc.nextInt();
    }
    System.out.println("Printing Array : ");
    for(int i=0;i < r;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println("\n");
    d.fcheck(a);
  }

}
