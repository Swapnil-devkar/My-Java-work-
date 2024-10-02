import java.util.*;



class State {



  void accept() {

    Scanner s = new Scanner(System.in);

    String name1 = "maharashtra", name2 = "pune";

    String name12;

    System.out.println("Enter your State :(1)-Maharashtra ,(2)-pune,(3)-Solapur: ");

    name12 = s.next();

    switch (name12) {

      case "maharashtra":

        if (name1 == name1) {

          String name20 = "a.nager", name24 = "Rahuri" ,name5;

          System.out.println("Select only one District : ");

          System.out.println("1. a.nagar");

          System.out.println("2.pune");

          System.out.println("3.solapur");

          System.out.println(" Enter the district:");

          name5 = s.next();

          if (name5 == name20) {

            String name7 = "Sangamaner", name8 = "Akole";

            System.out.println(" Enter the district :");

            String name34 = s.next();

            if (name7 == name7) {

              System.out.println("This is your State" + name1);

              System.out.println("This your District" + name5);

              System.out.println("This is  your " + name7);

            } else {

              System.out.println(" invalide Taluka");

            }

          } else {

            System.out.println(" invalide District");

          }

        } else {

          System.out.println(" you enter ROng choice: ");

        }



        // switch (name2) {

        // case "A.nagar":



        // break;



        // default:

        // break;

        // }

        break;



      default:

        break;

    }

  }



}



class poly {

  public static void main(String[] args) {

    State state = new State();

    state.accept();

    // state.display();

  }



}
