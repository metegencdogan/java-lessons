package fileIO;

import java.io.Serializable;

public class Person implements Serializable {

    private String userName;
    private String password;

    public Person() {

    }

    public Person(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
