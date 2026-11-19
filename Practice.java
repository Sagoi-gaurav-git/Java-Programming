import java.util.*;

public class Practice {
    public static void main(String[] args) {

       int[] arr ={25, 10, 75, 40, 90, 15};
       
       int max=arr[0];

       for(int i=1;i<arr.length;i++){

if(arr[i]>max){
    max=arr[i];
}

       }
System.out.println("the maximum element is "+max);

    }
}