package OOP4seminar.View;

import java.util.List;

import OOP4seminar.Model.Student;

public class StudentView implements View<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list) {
            System.out.println(i);
        }
    }
}
