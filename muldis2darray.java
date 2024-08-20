import java.util.Scanner;

public class muldis2darray {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the row size:");
        int row = obj.nextInt();

        System.out.println("Enter the size coloumn:");
        int col = obj.nextInt();

        int arr2[][] = new int[row][col];
        System.out.println("enter the value of array:");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = obj.nextInt();

            }
        }

        System.out.println("data enter by you:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("multiplication of array:");
        int mul = 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                mul = mul * arr2[i][j];

            }
            System.out.println(mul);
        }

    }
}