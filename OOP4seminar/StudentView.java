package OOP4seminar;

import java.util.List;

public class StudentView implements TeacherView<Student>{
    
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list) {
            System.out.println(i);
        }
    }
}
