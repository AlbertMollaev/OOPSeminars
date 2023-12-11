package Controler;

import Data.Type;
import Data.User;
import Data.Student;
import Data.StudyGroup;
import Service.DataService;
import Service.StudyGroupService;
import View.GroupView;
import View.StudentView;

import java.util.List;


public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final GroupView groupView = new GroupView();
    private final StudyGroupService sService = new StudyGroupService();

    public void createStudent(String firstName, String secondName,
            String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createGroups(int teacherId, List<Integer> studentIds) {
        sService.createGroup(teacherId, studentIds);
    }

    public void getAllGroups() {
        for (StudyGroup studyGroup: sService.getConcGroup()) {
            groupView.sendOnConsoleGroups(studyGroup);
        }
    }
}
