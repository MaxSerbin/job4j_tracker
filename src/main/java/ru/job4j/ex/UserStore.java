package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for(int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUsername())) {
                return users[i];
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
        User[] users = {new User("Petr", true), new User ("Mo", true), new User("XXX", false)};
        try {
            User user = findUser(users, "Mo");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        } catch (UserNotFoundException eb) {
            eb.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

}
