import java.util.Scanner;

 class numberselect {
    static void method1(){
        Scanner obj = new Scanner(System.in);
        System.out.println("guessing a any one number:(1-10)");

         System.out.println("Enter any one number:");
         int a= obj.nextInt();
            int n=4;
            if(n==a)
            {
                System.out.println("the number is match congulation your are win....!");
            }
            else{
                System.out.println("Sorry please try again..");
            }
    }
}
class mainn{
    public static void main(String[] args) {
        
//     numberselect obj11= new numberselect();
//     obj11.method1();
// 
numberselect.method1();
    }

}
