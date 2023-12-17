package OOP4seminar.Iterator;

import java.util.Iterator;
import java.util.List;

import OOP4seminar.Model.Teacher;
import OOP4seminar.Service.TeacherGroup;

public class TeacherIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList;
    private int counter;

    public TeacherIterator(TeacherGroup teacherGroup) {
        this.teacherList = teacherGroup.getTeacherList();
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (hasNext()) {
            return teacherList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) {
            teacherList.remove(counter);
        }

    }

}
