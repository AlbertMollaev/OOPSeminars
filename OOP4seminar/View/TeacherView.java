package OOP4seminar.View;

import java.util.List;
import OOP4seminar.Model.Teacher;

public class TeacherView implements View<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher i : list) {
            System.out.println(i);
        }
    }

}
