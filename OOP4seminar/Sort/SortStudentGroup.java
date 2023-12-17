package OOP4seminar.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import OOP4seminar.Model.Student;
import OOP4seminar.Model.Teacher;
import OOP4seminar.Service.StudentGroup;
import OOP4seminar.Service.TeacherGroup;

public class SortStudentGroup extends UsersGroupService {
    

    public SortStudentGroup(StudentGroup studentGroup, TeacherGroup teacherGroup) {
        super(studentGroup, teacherGroup);
    }


    public List<Student> getSortStudentGroup() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Teacher> getSortTeacher(){
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }


}
