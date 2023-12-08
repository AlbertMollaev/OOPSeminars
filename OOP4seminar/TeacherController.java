package OOP4seminar;

public interface TeacherController<T extends Teacher> {

    void create(String firstName, String secondName, String lastName);
    void sendOnConsole();
}
