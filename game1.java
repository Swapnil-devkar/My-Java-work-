//complete a program in intger.....!
import java.util.Scanner;

public class game1 {
    public static void main(String[] args) {

        int stone = 1;
        int paper = 2;
        int sicssor =3;

        Scanner obj = new Scanner(System.in);

        System.out.println("player one choice:");
        System.out.println("1.stone");
        System.out.println("2.paper");
        System.out.println("3.sicssor");

        
        int choice1 = obj.nextInt();

        System.out.println("player two choice:");
        System.out.println("1.stone");
        System.out.println("2.paper");
        System.out.println("3.sicssor");

        int choice2 = obj.nextInt();

        if (choice1 == choice2) {
            System.out.println("you select same choice...! please select diffrent choice");

        } else {
           
        
        
            switch (choice1) {
                case 1:// stone
                if (choice2 == sicssor) {
                    System.out.println("player one is win...!");
                    
                }
                else
                {
                    System.out.println(" player two is win...!");
                }

                    break;

                    case 2: //paper
                    if (choice2 == stone) {
                        System.out.println("player one is win...!");
                        
                    }
                    else
                    {
                        System.out.println(" player two is win...!");
                    }
    
                        break;

                    case 3: //sicssor
                if (choice2 == paper) {
                    System.out.println("player one is win...!");
                    
                }
                else
                {
                    System.out.println(" player two is win...!");
                }

                    break;
                
                    

                default:
                    break;
            }
        }
        }

    }


