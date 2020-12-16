//Easiest method for array rotation by taking two array timme complexity O(n*d) and space complexity O(n)

class Main
{
        void rotate(int arr[],int d,int n)
        {
            int b[]={0,0,0,0};
            for(int i=0;i<d;i++)
                b[i]=arr[i];
            for(int i=0,j=d;i<n-d;i++,j++)
               arr[i]=arr[j];
            for(int i=n-d,j=0;i<=n-1;i++,j++)
               arr[i]=b[j];
            for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
        }
  
  public static void main(String[] args)
  {
      Main ro = new Main();
    int arr[] = {1,2,3,4,5,6,7};
     ro.rotate(arr,2,7);
  }
}
