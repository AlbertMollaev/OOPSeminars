package OOP4seminar;

public interface TeacherService<T extends Teacher> {
    void create(String firstName, String secondName, String lastName);
}
