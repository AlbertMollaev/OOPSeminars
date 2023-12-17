package OOP4seminar.Controller;

import OOP4seminar.Model.User;
import OOP4seminar.Service.StudentService;
import OOP4seminar.View.StudentView;

public class StudentController implements Controller<User>{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
        
    }

    @Override
    public void sendOnConsole() {
        studentView.sendOnConsole(studentService.getStudentList());
        
    }
}
