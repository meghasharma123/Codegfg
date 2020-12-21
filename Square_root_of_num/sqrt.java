import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt ();
    int result = 1, i = 1;
    if (x == 0 || x == 1)
      System.out.print (x);
    while (result <= x)
      {

	i++;
	result = i * i;
      }
    System.out.print (i - 1);
  }
}
