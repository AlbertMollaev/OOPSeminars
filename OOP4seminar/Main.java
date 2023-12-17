package OOP4seminar;

import java.util.ArrayList;
import java.util.List;

import OOP4seminar.Sort.*;
import OOP4seminar.Controller.StudentController;
import OOP4seminar.Iterator.StudentGroupIterator;
import OOP4seminar.Model.Student;
import OOP4seminar.Model.Teacher;
import OOP4seminar.Service.StudentGroup;
import OOP4seminar.Service.TeacherGroup;
import OOP4seminar.Sort.UsersGroupService;

public class Main {
    public static void main(String[] args) {  
        Student student1 = new Student(1, "aaa", "aaa", "aaa");
        Student student2 = new Student(2, "aab", "aab", "aab");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(4, "bbb", "bbb", "bbb");
        Teacher teacher1 = new Teacher("Ivanova", "Maria", "Avanovna", 1);
        Teacher teacher2 = new Teacher("Alekseeva", "Anna", "Ivanovna", 2);
        Teacher teacher3 = new Teacher("Petrova", "Elena", "Sergeevna", 3);
        Teacher teacher4 = new Teacher("Zhirkova", "Olga", "Petrovna", 4);
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        List<Teacher> teacherList = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);
        studentGroup.addStudent(student4);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student1);
        teacherGroup.addTeacher(teacher1);
        teacherGroup.addTeacher(teacher2);
        teacherGroup.addTeacher(teacher3);
        teacherGroup.addTeacher(teacher4);

        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // UsersGroupService service = new UsersGroupService(studentGroup, null);
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // SortStudentGroup sort = new SortStudentGroup(studentGroup, null);
        // for (Student student : sort.getSortStudentGroup()) {
        //     System.out.println(student);
        // }
        System.out.println();
        SortByFIO sortFio = new SortByFIO(studentGroup, teacherGroup);
        for (Teacher teacher : sortFio.getSortTeacherByFIO()) {
            System.out.println(teacher);
        }
        System.out.println();
        for (Student student : sortFio.getSortStudentsByFIO()) {
            System.out.println(student);
        }
        System.out.println();

        SortStudentGroup sortGroup = new SortStudentGroup(studentGroup, teacherGroup);
        for (Student student : sortGroup.getSortStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Teacher teacher : sortGroup.getSortTeacher()) {
            System.out.println(teacher);
        }
    }
}
