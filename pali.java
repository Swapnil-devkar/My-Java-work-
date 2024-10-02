import java.util.Scanner;

public class pali {
    public static void main(String[] args) {
        int n ,r, t, sum=0;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the number:");
        n = obj.nextInt();
        t=n;
        while(n>0)
        {
            r= n%10;
            sum= sum *10+r;
            n=n/10;
        }
        if(sum ==n)
        {
            System.out.println("it is palindrome"); 
        }
        else{
             System.out.println("is not a palindrome");
        }


    }
}

