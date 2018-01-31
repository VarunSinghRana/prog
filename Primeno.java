import java.util.Scanner;
public class Primeno {
	 public static void main(String[] args) 
	  {
		 int i,n,c=0;
		 Scanner sr = new Scanner(System.in);
		 System.out.print("Enter value of n:");
		 n = sr.nextInt();
		 for(i=2;i<n;i++)
		 {
			if(n%i==0)
			{
			  c++;
			}
			}
		if(c==0)
		{System.out.print("Prime number");}
		else
		{System.out.print("Not a Prime number");}
	   }
	 
	 }

