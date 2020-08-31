package by.bntu.fitr.poisit.lytkina.bean;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private boolean isBlock;
    private int numberOfAttempts;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        isBlock = false;
        numberOfAttempts = 3;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isBlock == user.isBlock &&
                numberOfAttempts == user.numberOfAttempts &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, isBlock, numberOfAttempts);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isBlock=" + isBlock +
                ", numberOfAttempts=" + numberOfAttempts +
                '}';
    }
    public void dropNumberOfAttempts(){
        numberOfAttempts = 3;
    }


}
