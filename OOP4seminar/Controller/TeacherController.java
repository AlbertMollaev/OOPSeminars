package OOP4seminar.Controller;

import OOP4seminar.Model.User;
import OOP4seminar.Service.TeacherService;
import OOP4seminar.View.TeacherView;

public class TeacherController implements Controller<User>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }
}
