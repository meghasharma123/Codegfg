public class Main
{
  public static void countFreq (int arr[], int n)
  {
    boolean visited[] = new boolean[n];
    Arrays.fill(visited, false);	//Declare an array of boolean type with initalizing all the value as false
    //Traverse through the array and count the frequencies
    for (int i = 0; i < n; i++)
      {
	if (visited[i] == true)
	  continue;
	//Count frequencies
	int count = 1;
	for (int j = i + 1; j < n; j++)
	  {
	    if (arr[i] == arr[j])
	      {
		visited[j] = true;
		count++;
	      }
	  }

	System.out.println (arr[i] + " " + count);

      }

  }
  public static void main (String[]args)
  {
    int arr[] = new int[]{ 10, 10, 20, 30, 20, 30, 40, 40, 20, 20 };
    int n = arr.length;
    countFreq (arr, n);		//Calling function to print values
  }
}
