import java.util.Scanner;

public class state {
    public static void main(String[] args) {
        String dist ="district";
        String taluka ="taluka";
        String state="state";


        Scanner obj = new Scanner(System.in);

        System.out.println("select your state:");
        System.out.println("1.Maharashtra");
        System.out.println("2.Jugrat");
        System.out.println("3.Panjab");

        state = obj.nextLine();

        switch (state) {
            case "Maharashtra":

                System.out.println("select your district in maharashtra:");
                System.out.println("1.A.nagar");
                System.out.println("2.Nashik");
              
                String districtm = obj.nextLine();
                 if(districtm)
                 {

                    System.out.println("Select Your taluka in A.nagar:");
                    System.out.println("1.sangamaner");
                    System.out.println("2.Akole");
                    System.out.println("3.Shirampur");
            
                    String taluka = obj.nextLine();
                 }
                 else
                 {
                    System.out.println("select your taluka in Nashik:");
                    System.out.println("1.Sinner");
                    System.out.println("2.Thangav");
                    System.out.println("3.sfsfsf");
            
                    String taluka= obj.nextLine();
                 }

                break;

                case "jugrat":

                System.out.println("select your district:");
                System.out.println("1.A.nagar");
                System.out.println("2.Nashik");
                System.out.println("3.Pune");
                String district = obj.nextLine();

                break;

                case "panjab":

                System.out.println("select your district:");
                System.out.println("1.A.nagar");
                System.out.println("2.Nashik");
                System.out.println("3.Pune");
                String district = obj.nextLine();

                break;

            default:
                break;
        }

   

    }

}
