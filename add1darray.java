import java.util.Scanner;

public class add1darray {
 public static void main(String[] args) {
    int add=0;
    Scanner s= new Scanner (System.in);
    System.out.println("enter the array size:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array element:");
    for(int i=0; i<n; i++)
    {
        arr[i]=s.nextInt();

    }
    System.out.println("Addtion");
    for( int i=0; i<n; i++)
    {
        add = add + arr[i];

    }
    System.out.println("addtion"+ add);

 }   
}
