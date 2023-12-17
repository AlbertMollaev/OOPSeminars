package OOP4seminar.Service;

import java.util.ArrayList;
import java.util.List;
import OOP4seminar.Model.Teacher;

public class TeacherService implements Service<Teacher> {
    private final List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher teacher : teacherList) {
            if (maxId < teacher.getTeacherId()) {
                maxId = teacher.getTeacherId();
            }
            teacherList.add(new Teacher(lastName, firstName, secondName, ++maxId));
        }
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
