public class Main
{
  public static int floorsqt (int x)
  {
    if (x == 0 || x == 1)
      return x;
    // Binary search for x
    int start = 1, end = x, ans = 0;
    while (start <= end)
      {
	int mid = (start + end) / 2;

	if (mid * mid == x)	//If x is a perfect square
	  return mid;
	if (mid * mid < x)
	  {
	    start = mid + 1;
	    ans = mid;
	  }
	else
	    end = mid - 1;	//mid*mid is grater than x 
      }
    return ans;
  }
  public static void main (String[]args)
  {
    int x = 11;
    System.out.print (floorsqt (x));
  }
}

