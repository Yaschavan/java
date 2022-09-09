public class Variable
{
  int i=4;//Instance Variable 

  public void build()
  {
  int a=6; //local variable 
  System.out.println("local variable : "+a);
}

static int b=9;//Static Variable 

  public static void main(String[] args)
{
  Variable v1 = new Variable();
  System.out.println("Instance Variable i : "+v1.i);
  Variable v2 = new Variable();
  v2.build();
  System.out.println("Static Variable b : "+Variable.b);
  
}
}
