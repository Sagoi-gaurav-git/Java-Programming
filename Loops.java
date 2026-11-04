import java.util.*;
public class Loops {
     public static void main(String[]args){
        // for(int counter=0;counter<100;counter=counter+1){
        //     System.out.println("Hello world");
        // }
        // for(int counter=0;counter<11;counter++){
        //     System.out.println(counter);
        // }
        // int i=0;
        // while (i<11) {
        //     System.out.println(i);
        //     i++;
            
        // }
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<11);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //         sum=sum+i;
    //     }
    //     System.out.println(sum); 
    for(int i=1;i<11;i++){
        System.out.println(n*i);
    }
       sc.close();
     }
}
 
    //     int choice;
    //     do{
    //         System.out.println("enter choice 1 to continue and 0 to stop");
    //          choice = sc.nextInt();
    //         if (choice==1){
    //             System.out.println("enter marks of student out of 100");
    //             int marks = sc.nextInt();
    //             if(marks>=90){
    //                 System.out.println("This is good");
    //             }
    //             else if(marks>=60){
    //                 System.out.println("This is also good");

    //             }
    //             else if(marks>=0){
    //                 System.out.println("this is also good");
    //             }
    //             else{
    //                 System.out.println(" invalid marks");
    //             }
    //         }
            
    // }while (choice==1); 