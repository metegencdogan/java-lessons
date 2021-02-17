package fileIO;

import java.io.*;
import java.nio.file.Path;

public class FileService {

    private static File file = null;
    private static Path path = Path.of("/root/Desktop/");


    public static boolean checkFileIsExist(String fileName) {
        String tempPath = path + "/" + fileName + ".user";
        file = new File(String.valueOf(tempPath));
        return file.exists();
    }

    public static void createUser(Person person) throws IOException {
        createFile(person.getUserName());
        String tempPath = path + "/" + person.getUserName() + ".user";
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(String.valueOf(tempPath)));) {
            os.writeObject(person);
            System.out.println("User is created. Re-directing to the Sign-in page...");
            new SignInService();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static Person getUser(String fileName) throws IOException {
        createFile(fileName);
        String tempPath = path + "/" + fileName + ".user";
        Person person = null;
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(String.valueOf(tempPath)));) {
            person = (Person) os.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return person;
    }

    private static void createFile(String userName) throws IOException {
        String tempPath = path + "/" + userName + ".user";
        File file = new File(tempPath);
        file.createNewFile();
    }


}
