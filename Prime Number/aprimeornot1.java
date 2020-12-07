//Naive solution to find whether a given number is prime or not

public class Main
{
  public static int prime(int n)
  { 
     if(n==0 || n==1)
        return 0;
      else if(n==2)
          return 1;
      else
      {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
           if(n%i == 0)
              return 0;
        }
     }
     else
        return 1;
  }
  public static void main(String[] args)
  {
    int n=67;
    if(prime(n))
      System.out.print("Prime");
    else
      System.out.print("Not Prime");
  }
}
