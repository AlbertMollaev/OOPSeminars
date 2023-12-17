package OOP4seminar.Service;

import java.util.Iterator;
import java.util.List;

import OOP4seminar.Iterator.TeacherIterator;
import OOP4seminar.Model.Teacher;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator(this);
    }

}
