package OOP4seminar.View;

import java.util.List;

import OOP4seminar.Model.User;

public interface View<T extends User> {
    void sendOnConsole(List<T> list);
}
