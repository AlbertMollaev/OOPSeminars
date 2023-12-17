package OOP4seminar.Sort;

import java.util.ArrayList;
import java.util.List;

import OOP4seminar.Service.StudentGroup;
import OOP4seminar.Service.TeacherGroup;
import OOP4seminar.Comparator.TeacherComparator;
import OOP4seminar.Model.Student;
import OOP4seminar.Model.Teacher;
import OOP4seminar.Model.User;

public class SortByFIO extends UsersGroupService {

    public SortByFIO(StudentGroup studentGroup, TeacherGroup teacherGroup) {
        super(studentGroup, teacherGroup);
    }

    public List<Student> getSortStudentsByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new TeacherComparator<User>());
        return studentList;
    }

    public List<Teacher> getSortTeacherByFIO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(new TeacherComparator<User>());
        return teacherList;
    }
}
