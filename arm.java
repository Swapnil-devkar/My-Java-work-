import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        {
            int n , r,t, sum =0;
            Scanner obj= new Scanner(System.in);
            System.out.println("enter the number:");
             n = obj.nextInt();
             t=n;
             while (n>0) {
                r=n %10;
                sum = sum +r*n*n;
                n= n/10;
                
             }
             if (sum == n)
              {
                 System.out.println("it is armstrong number");
              }
              else
              {
                System.out.println("it is not a armstrong number");
              }
        }
    }
    
}
