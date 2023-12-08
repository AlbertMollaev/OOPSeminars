package OOP4seminar;

public class StudentController implements TeacherController<Student>{
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
