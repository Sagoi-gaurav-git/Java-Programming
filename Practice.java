import java.util.*;
public class Practice{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter units");
      int units= sc.nextInt();
      int bill=0;

      if(units<=100){
        bill=units*5;
        System.out.println(bill);

      }
      else if(units<=200&&units>100){
        bill = 100*5+(units-100)*7;
        System.out.println(bill);
      }
      else{
        bill=100*5+100*7+(units-200)*10;
        System.out.println(bill);
      }


    }
    
}