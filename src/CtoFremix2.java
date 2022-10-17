import java.util.Scanner;

public class CtoFremix2 {
    public static void main(String[] args) {
        double ctemp;
        double ftemp;
        String trash;
        String userResp;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Enter your temperature in celsius");
            if (!in.hasNextDouble()) {
                System.out.println("You entered an invalid temperature in celsius");
                in.nextLine();
            } else {
                ctemp = in.nextDouble();
                ftemp = (ctemp * 1.8) + 32;
                System.out.println(" Your temperature in fahrenheit is " + ftemp);
                in.nextLine();
            }
            System.out.println("Do you want to re enter another celsius [y/n]");
            userResp = in.nextLine();
            if (userResp.equalsIgnoreCase("n")) {//When comparing string don't use == that is for numbers
                done = true;
            }

        }while (!done) ;
    }
}
