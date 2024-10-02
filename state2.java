import java.util.*;

public class state2 {
    public static void main(String[] args) {

        int state;
        int district;
        int taluka;

        Scanner obj = new Scanner(System.in);
        System.out.println("Select your state:/1.Maharashtra/2.Panjab/3.Gujrat");

        state = obj.nextInt();

        if (state <= 3) {
            switch (state) {
                case 1: // state for Maharashtra
                    System.out.println("Select district in Maharashtra:/1.Nashik/2.A nagar/3.Pune");
                    district = obj.nextInt();

                    if (district == 1) {
                        System.out.println("Select your taluka in Nashik:/1.sinner/2.yeola/3.Niphad");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out
                                    .println("Your State is Maharashtra district is and your Taluka is sinner");
                        } else if (taluka == 2) {
                            System.out.println("Your State is Maharashtra district is Nashik and your Taluka is Yeola");
                        } else {
                            System.out
                                    .println("Your State is Maharashtra district is Nashik and your Taluka is Niphad");
                        }

                    } else if (district == 2) {

                        System.out.println("Select your taluka  in A.nagar:/1.Sangamner/2.Akole/3.Loni");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out.println(
                                    "Your State is Maharashtra district is A.nagar and your Taluka is Sangamner");
                        } else if (taluka == 2) {
                            System.out
                                    .println("Your State is Maharashtra district is A.nagar and your Taluka is Akole");
                        } else {
                            System.out.println("Your State is Maharashtra district is A.nagar and your Taluka is Loni");
                        }

                    } else if (district == 3) {
                        System.out.println("Select  your taluka in pune:/1.khed/2.Shirur/3.Indapur");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out.println("Your State is Maharashtra district is Pune and your Taluka is khed");
                        } else if (taluka == 2) {
                            System.out.println("Your State is Maharashtra district is Pune and your Taluka is Shirur");
                        } else {
                            System.out
                                    .println("Your State is Maharashtra district is Pune  and your Taluka is Indapur");
                        }

                    } else {
                        System.out.println("your are selecting a wrong choice... Please select correct choice(1-3)");
                    }

                    break;
                case 2: // State for Panjab
                    System.out.println("Select district in Panjab:/1.Amritsar/2.Barnala/3.Bathinda");
                    district = obj.nextInt();
                    if (district == 1) {
                        System.out.println("Select your taluka in Amritsar:/1.A/2.B/3.C");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out
                                    .println("You State is Maharashtra district is Amritsar  and your Taluka is A");
                        } else if (taluka == 2) {
                            System.out.println("Your State is Maharashtra district is Amritsar  and your Taluka is B");
                        } else {
                            System.out
                                    .println("Your State is Maharashtra district is Amritsar  and your Taluka is C");
                        }

                    } else if (district == 2) {

                        System.out.println("Select your taluka  in Barnala:/1.M/2.N/3.O");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out.println(
                                    "Your State is Maharashtra district is Barnala and your Taluka is M");
                        } else if (taluka == 2) {
                            System.out
                                    .println("Your State is Maharashtra district is Barnala and your Taluka is N");
                        } else {
                            System.out.println("Your State is Maharashtra district is Barnala and your Taluka is O");
                        }

                    } else if (district == 3) {
                        System.out.println("Select  your taluka in Bathinda :/1.X/2.Y/3.Z");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out.println("Your State is Maharashtra district is Bathinda and your Taluka is X");
                        } else if (taluka == 2) {
                            System.out.println("Your State is Maharashtra district is Bathinda and your Taluka is Y");
                        } else {
                            System.out
                                    .println("Your State is Maharashtra district is Bathinda and your Taluka is Z");
                        }

                    } else {
                        System.out.println("your are selecting a wrong choice... Please select correct choice(1-3)");
                    }

                    break;

                    case 3: // State for Gujarat 
                    System.out.println("Select district in Gujarat :/1.Anand/2.Amreli/3.Rajkot");
                    district = obj.nextInt();
                    if (district == 1) {
                        System.out.println("Select your taluka in Anand:/1.Petlad/2.Sojitr/3.Tarapur");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out
                                    .println("You State is Maharashtra district is Anand and your Taluka is Petlad");
                        } else if (taluka == 2) {
                            System.out.println("Your State is Maharashtra district is Anand  and your Taluka is Sojitr");
                        } else {
                            System.out
                                    .println("Your State is Maharashtra district is Anand and your Taluka is Tarapur");
                        }

                    } else if (district == 2) {

                        System.out.println("Select your taluka  in Amreli:/1.Lathi/2.Khamba/3.Dhari");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out.println(
                                    "Your State is Maharashtra district is Amreli and your Taluka is Lathi");
                        } else if (taluka == 2) {
                            System.out
                                    .println("Your State is Maharashtra district is Amreli and your Taluka is Khamba");
                        } else {
                            System.out.println("Your State is Maharashtra district is Amreli and your Taluka is Dhari");
                        }

                    } else if (district == 3) {
                        System.out.println("Select  your taluka in Rajkot :/1.X/2.Y/3.Z");
                        taluka = obj.nextInt();
                        if (taluka == 1) {
                            System.out.println("Your State is Maharashtra district is Rajkot and your Taluka is X");
                        } else if (taluka == 2) {
                            System.out.println("Your State is Maharashtra district is Rajkot and your Taluka is Y");
                        } else {
                            System.out
                                    .println("Your State is Maharashtra district is Rajkotand your Taluka is Z");
                        }

                    } else {
                        System.out.println("your are selecting a wrong choice... Please select correct choice(1-3)");
                    }

                    break;

                default:

            }
        } else {
            System.out.println("your are entring a invaild option....! please select correct option");
        }

    }
}
