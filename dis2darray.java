import java.util.*;

public class dis2darray {
   public static void main(String[] args) {
      
      Scanner s=new Scanner(System.in);
      System.out.println("enter a 2d array size:");
      int row=s.nextInt();
      int col=s.nextInt();
      System.out.println("enter the array elements:");
      int arr2[][]=new int[row][col];
      for(int i=0;i<row; i++)
      {
        for(int j=0; j<col;j++)
        {
            arr2[i][j]=s.nextInt();

        }
      }
System.out.println("array your entered:");
for(int i=0; i<row; i++)
{
    for( int j=0; j<col; j++)
    {
        System.out.print(arr2[i][j]);

    }
    
    System.out.println();
}
   }
}


