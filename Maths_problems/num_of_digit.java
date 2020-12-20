import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	    int y = (int)(Math.log(x) / Math.log(10));
		 y = (int)Math.floor(y)+1;
		System.out.print("Number of digits in the number "+x+ " is:"+y);
	}
}
//Time complexity is O(1).
