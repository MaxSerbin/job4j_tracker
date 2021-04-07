package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    public static boolean validate(User user) throws UserInvalidException {
           if (user.getUsername().length() < 3 || !user.isValid()) {
               throw new UserInvalidException("User not valid.");
           }
             return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr", true), new User("Mo", true), new User("XXX", false)};
        try {
            User user = findUser(users, "Mo");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (Throwable ea) {
            ea.printStackTrace();
        }
    }

}
