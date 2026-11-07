import java.util.*;
public class Practice{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the first number");
      int a = sc.nextInt();
      System.out.println("enter the second number");
      int b= sc.nextInt();
      System.out.println("Enter operator(+,-,*,/)");
      char operator = sc.next().charAt(0);
      switch(operator){
        case '+':
          System.out.println(a+b);
          break;
          case '-':
            System.out.println(a-b);
            break;
            case '*':
              System.out.println(a*b);
              break;
              case '/':
                if(b!=0){
                  System.out.println(a/b);
                }
                else{
                  System.out.println("divison by zero is not all0wed");
                }
                break;
                default:
                  System.out.println("Invalid Operator");

      }

      

    }
    
}