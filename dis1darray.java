import java.util.*;

public class dis1darray {
   public static void main(String[] args) {

      Scanner row = new Scanner(System.in);
      System.out.print("enter the row size:");
      int n = row.nextInt();
      
      int arr[] = new int[n];
      System.out.println("enter the value of row:");

      for (int i = 0; i < n; i++) {

        

            arr[i] = row.nextInt();
            
         }
         System.out.println("array element are:");
         for(int i=0; i<n; i++)
         {
            System.out.println(arr[i]);
         }
     }

   }


