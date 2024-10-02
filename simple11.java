import java.util.*;

public class simple11 {
    private int a;
    private int b;

    void accept() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of a:");
        a = obj.nextInt();
        System.out.println("enter the value of b:");
        b = obj.nextInt();

    }

    void display() {
        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);
    }

    void display2(int a ,int b){
        System.out.println("value of a b:"+a+b);

    }

    public static void main(String[] args) {
        simple11 obj1 = new simple11();
        obj1.accept();
        obj1.display();
        obj1.display2(200, 990);

    }

}
