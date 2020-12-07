//using a single array with less time complexity.
public class Main
{
  public static int findwater(int[] arr,int n)
  {
    int lo=0,hi=n-1,right_max=0,left_max=0,result=0;
     while(lo<=hi)
     {
       if(arr[lo]<arr[hi])
        {
          if(arr[lo]>left_max)
             left_max = arr[lo];
          else
             result += left_max-arr[lo];
           lo++;
        }
        else
        {
          if(arr[hi]>right_max)
             right_max = arr[hi];
          else
            result += right_max;
         hi--;
        }
      }
      return result;
   }
   
   public static void main(String[] args)
   {
     int arr[] = {1,0,2,3,4,0,6,0,8};
     int n = arr.length;
     System.out.print("result is "+findwater(arr,n));
   }
   
 }
 
 
 // Output is : 11
