import fileIO.SignInService;
import fileIO.SignUpService;

import java.io.IOException;
import java.util.Scanner;


/*
1-> we are using embedded try block to close our buffers after process finish or we can use finally
 */

public class TesterForFileOperations {

    public static void main(String[] args) throws IOException { //Controlling logic

        //1.Ask User Sign-in or Sign-up

        Scanner scanner = new Scanner(System.in);

        boolean isGo = false;
        int option = 0;

        while (!isGo) {
            System.out.println("*************************");
            System.out.println("*      [1] Sign-up      *");
            System.out.println("*      [2] Sign-in      *");
            System.out.println("*************************");
            System.out.println("Select what you want to do : ");
            option = scanner.nextInt();

            if (option == 1 || option == 2) {
                isGo = true;
                System.out.println("Please enter 1 or 2!");
            } else  {
                isGo = false;
            }
        }
        if (option == 1) {
            SignUpService signUpService = new SignUpService();
        } else if (option == 2) {
            SignInService signInService = new SignInService();
        }

        //CODE FOLLOWING

    }

}
