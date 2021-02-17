package fileIO;

import java.io.IOException;
import java.util.Scanner;

public class SignUpService {

    //1.Get username and check it is exist or not (to prevent the user re-sign-up with registered credentials)
    //2.Get password and re-writing of password
    //3.After success message of sign-up redirect user to sign-in page

    private static Scanner scanner;

    public SignUpService() throws IOException {
        System.out.println("*************************");
        System.out.println("*        SIGN-UP        *");
        System.out.println("*************************");
        scanner = new Scanner(System.in);
        getCredentials();
    }


    public static void getCredentials() throws IOException {
        String userName = getUsername();
        String password;
        if (!checkUserIsExist(userName)) {
            password = getPassword();
            FileService.createUser(new Person(userName, password));
        } else {
            System.out.println("You are re-directing to the Sign-in page...");
            new SignInService(); //Run SignInService Constructor
        }
    }

    public static String getUsername() {
        System.out.println("Please enter your Username : ");
        String userName = scanner.nextLine();
        return userName;
    }

    public static String getPassword() {
        System.out.println("Please enter your Password : ");
        String password = scanner.nextLine();
        String reWritePassword = "";
        while (!password.equals(reWritePassword)) {
            System.out.println("Please re-write you Password");
            reWritePassword = scanner.nextLine();
        }
        return password;
    }

    public static boolean checkUserIsExist(String userName) {
        return FileService.checkFileIsExist(userName);
    }

}
