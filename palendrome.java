import java.util.Scanner;
class palendrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n; 
  Scanner sr = new Scanner(System.in);
  System.out.print("Enter value of n:");
  n = sr.nextInt();  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}