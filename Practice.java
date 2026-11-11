
import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int largest=0;
        
        while(n>0){
          int lastdigit=n%10;
          if(lastdigit>largest){
            largest=lastdigit;
          }
          n=n/10;
        }
        System.out.println(largest);


        
          
    }
} 