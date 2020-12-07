//Method 1 to trap water stored after raining width of bar is constant 1.
public class main
{
  public class maxWidth(int[] arr,int n)
  { 
    int res =0;
    for(int i=1;i<n-1;i++)
    {
      int left = arr[i];
      for(int j=0;j<i;j++)
        left = Math.max(left,arr[j]);
      int right = arr[i];
      for(int j=i+1;j<n;j++)
        right = Math.max(right,arr[i]);
      res += min(left,right)-arr[i];
    }
    return res;
  }
  public static void main(string[] args)
  {
    int[] arr = {0,1,2,7,5,4,1,5,0,6};
    int n=arr.length;
    System.out.print(maxWidth(arr,n));
  }
}

//Output of this is 15
