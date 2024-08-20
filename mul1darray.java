import java.util.*;
public class mul1darray {
    public static void main(String[] args) {

         Scanner obj= new Scanner(System.in);
         System.out.println("enter the size of array:");

         int n = obj.nextInt();
         int arr[]= new int[n];

         System.out.println("enter the value of array");
         for(int i=0; i<n; i++)
         {
            arr[i]= obj.nextInt();
         }
         System.out.println("array entered values:");
         for( int i=0; i<n; i++)
         {
            System.out.println(arr[i]);
         }
         System.out.println("multiplication of enter array:");
         int mul=1;
         for( int i=0; i<n; i++)
         {
            mul = mul * arr[i];
         }
         System.out.println(mul);

    }
    
}
