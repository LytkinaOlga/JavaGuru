package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.User;

public class UserService {

    public boolean login(User user, String password){

        if (checkIfPasswordsAreEqual(user, password)){
            if (isUserBlocked(user)){
                dropNumberOfAttempts(user);
            }
            return true;
        }else {
            reduceNumberOfAttempts(user);
            if (ifNumberOfAttemptsIsDrop(user)){
                blockUser(user);
            }
            return false;
        }
    }
    public boolean checkIfPasswordsAreEqual(User user, String password){
        return user.getPassword().equals(password);
    }
    public void dropNumberOfAttempts(User user){
        user.dropNumberOfAttempts();
    }
    public boolean isUserBlocked(User user){
        return  user.isBlock();
    }
    public User reduceNumberOfAttempts(User user){
        int newNumberOfAttempt = user.getNumberOfAttempts() - 1;
        user.setNumberOfAttempts(newNumberOfAttempt);
        return user;
    }
    public User blockUser(User user){
        user.setBlock(true);
        return user;
    }
    public  boolean ifNumberOfAttemptsIsDrop(User user){
        return user.getNumberOfAttempts() == 0;

    }
}
