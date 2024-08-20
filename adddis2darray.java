import java.util.*;

class adddis2darray {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter the size of row:");
        int row = obj.nextInt();

        System.out.println("enter the size of coloum:");
        int col = obj.nextInt();

        int array[][] = new int[row][col];

        System.out.println("enter the arrays values:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = obj.nextInt();
            }
        }
        System.out.println("data that your enter:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("addition of row and cols");
        int add=0;
        for(int i=0; i< array.length; i++)
        {
            for(int j=0; j<array.length; j++)
            {
          add = add + array[i][j]; 

          
            }
           System.out.println(add);
        }
        
    }
}