import java.util.*;

class boi {
    void accept22() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Select your options:/(1).Cashwithdrow/(2)check balance./(3).Diposited");
        int option = obj.nextInt();
        int amount = 20000;
        int total;
        switch (option) {
            case 1: { // it is withdrow amount
                System.out.println("Enter the amount that you have to withdrow...!");
                Scanner obj2 = new Scanner(System.in);
                int wam = obj2.nextInt(); 
                if (wam > 0 && wam <= 10000) {
                    System.out.println("Your cash withdrow succesfully...!");
                    total = amount - wam;
                    System.out.println("your account balance is:" + total);

                } else {
                    System.out.println("you not withdrow less than zero and greater than 10000 Amount");
                }
            }
                break;

            case 2: { // this is for balance
                int balance = amount;

                System.out.println("your balance:" + balance);
            }
                break;

            case 3: {// this is for deposited amount 
                
                System.out.println("Enter the amount that your have to deposited");
                Scanner obj3 = new Scanner(System.in);
                int deno = obj3.nextInt();
                deno = amount + deno;
                System.out.println("your deposited amount sucessfully!!");
                System.out.println("your total amount is:" + deno);
            }
                break;
        }
    }

}

class bank {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your account number(6655):");
        int ano = obj.nextInt();

        System.out.println("Enter your password(123):");
        int pass = obj.nextInt();

        if (ano == 6655 && pass == 123) {
            System.out.println("Welcome in a Bank of India.....!!");
            boi obj1 = new boi(); // create a object of class
            obj1.accept22();
            // obj1.Cashwithdrow();

        } else {
            System.out.println("Your id and password are incorrect!! pleace try again..!!");
        }
    }

}
