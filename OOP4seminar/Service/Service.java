package OOP4seminar.Service;

import OOP4seminar.Model.User;

public interface Service<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
