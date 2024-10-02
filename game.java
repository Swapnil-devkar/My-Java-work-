// complete a program in String......!
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
       String stone = "stone";
        String paper = "paper";
        String sicssor ="sicssor";

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the one choice:/stone(1)/paper(2)/sicssors(3)");
      
        String choice1 = obj.nextLine();

        System.out.println("Enter the two choice:/stone(1)/paper(2)/sicssors(3)");
        String choice2 = obj.nextLine();

        if (choice1 == choice2) {
            System.out.println("you select same choice...! please select diffrent choice");

        } else {
           
        
        
            switch (choice1) {
                case "stone":// stone
                if (choice2 == sicssor) {
                    System.out.println("player one is win...!");
                    
                }
                else
                {
                    System.out.println(" player two is win...!");
                }

                    break;

                    case "paper": //paper
                    if (choice2 == stone) {
                        System.out.println("player one is win...!");
                        
                    }
                    else
                    {
                        System.out.println(" player two is win...!");
                    }
    
                        break;

                    case "sicssor": //sicssor
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
