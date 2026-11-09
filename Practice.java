import java.util.*;
public class Practice{
    public static void main(String[]args){

   
  Scanner sc = new  Scanner(System.in);
  System.out.println("enter the number");
  int n= sc.nextInt();
  int reverse=0;
  int original=n;
  if(n<0){
    System.out.println("not a palindrome");
  }
  while(n>0){
    int lastdigit=n%10;
    reverse=reverse*10+lastdigit;
    n=n/10;
  }
  if(reverse==original){
    System.out.println("palindrome");
  }
  else{
    System.out.println("not a palindrome");
  }


  










    }

}