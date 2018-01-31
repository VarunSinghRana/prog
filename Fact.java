import java.util.Scanner;
class Fact{  
 public static void main(String args[]){  
  int i,fact=1;  
  int n; 
  Scanner sr = new Scanner(System.in);
  System.out.print("Enter value of n:");
  n = sr.nextInt();  
  
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}
