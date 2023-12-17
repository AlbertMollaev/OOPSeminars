package OOP4seminar.Sort;

import OOP4seminar.Service.StudentGroup;
import OOP4seminar.Service.TeacherGroup;

public class UsersGroupService{
    protected StudentGroup studentGroup;
    protected TeacherGroup teacherGroup;

    public UsersGroupService(StudentGroup studentGroup, TeacherGroup teacherGroup) {
        this.studentGroup = studentGroup;
        this.teacherGroup = teacherGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

}
