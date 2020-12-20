import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int x = (int)(Math.random()*100);
		System.out.print("You have only 10 chances to guess...");
		Scanner sc = new Scanner(System.in);
		int count =0;
		while(count<=10)
		{
		    count++;
		    int guess = sc.nextInt();
		    if(guess>x){
		        System.out.print("Yor guess is too large");
		    }
		    else if(guess<x){
		        System.out.print("Your guess is too small");
		    }
		    else{
		        System.out.print("Congratulations you did it in "+count+" Counts");
		        break;
		    }
		   
		}
		if(count>=10)
		 System.out.print("The number is "+x+" Bad luck..!! Better luck next time");
	}
}
