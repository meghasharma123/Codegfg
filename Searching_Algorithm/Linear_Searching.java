public class Main
{
  public static void main (String[]args)
  {
    int arr[] = { 60, 54, 78, 5, 1, 79, 0, 55, 90 };
    int x = 60;
    int result = search (arr, x);
    if (result == -1)
      System.out.print ("Not found");
    else
      System.out.print ("Index of " + x + " is: " + result);
  }
  public static int search (int arr[], int x)
  {
    int l = arr.length;
    for (int i = 0; i < l; i++)
      {
	if (arr[i] == x)
	  {
	    return i + 1;
	  }
      }
    return -1;
  }
}
