package OOP4seminar.Controller;

import OOP4seminar.Model.User;

public interface Controller<T extends User> {

    void create(String firstName, String secondName, String lastName);

    void sendOnConsole();

}
