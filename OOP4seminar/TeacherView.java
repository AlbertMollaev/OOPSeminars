package OOP4seminar;

import java.util.List;

public interface TeacherView <T extends Teacher> {
    void sendOnConsole(List<T> list);
}
