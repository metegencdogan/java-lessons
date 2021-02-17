package fileIO;

import java.io.IOException;
import java.util.Scanner;

public class SignInService {

    //1.Get username and password
    //2.Check user is registered or not (if not direct to sign-up)
    //3.If user registered before, get the file that printed user credentials
    //4.Check password is true or not (when it is not true give 3 chance)
    //5.If password true than write out a success message

    private static Scanner scanner;

    public SignInService() throws IOException {
        System.out.println("*************************");
        System.out.println("*        SIGN-IN        *");
        System.out.println("*************************");
        scanner = new Scanner(System.in);
        getCredentials();
    }

    public static void getCredentials() throws IOException {
        String userName = getUsername();
        String password;
        if (checkUserIsExist(userName)) {
            password = getPassword();
            checkUserCredentials(userName, password, FileService.getUser(userName));
        } else {
            System.out.println("We can not find this user! You are re-directing to the Sign-up page...");
            new SignUpService();
        }
    }

    public static String getUsername() {
        System.out.println("Please enter your Username : ");
        return scanner.nextLine();
    }

    public static String getPassword() {
        System.out.println("Please enter your Password : ");
        return scanner.nextLine();
    }

    public static boolean checkUserIsExist(String userName) {
        return FileService.checkFileIsExist(userName);
    }

    public static void checkUserCredentials(String userName, String password, Person person) throws IOException {
        int chance = 3;
        if (userName.equals(person.getUserName()) && password.equals(person.getPassword())) {
            System.out.println("Successfully signed-in!");
        } else {
            System.out.println("Check your credentials!");
            while (!userName.equals(person.getUserName()) || !password.equals(person.getPassword()) && chance != 0) {
                getCredentials();
                chance--;
                if (chance == 0) {
                    System.out.println("You need to talk with your admin :(");
                }
            }
        }
    }
}
