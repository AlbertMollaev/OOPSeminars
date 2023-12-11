import java.util.List;

import Controler.Controler;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.getAllStudent();
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        controler.getAllStudent();

        controler.createGroups(1, List.of(1, 1, 1, 7));
        controler.createGroups(2, List.of(2, 2, 1, 6));
        controler.createGroups(4, List.of(1, 3, 1, 5));
        controler.createGroups(3, List.of(1, 4, 4, 8));
        controler.getAllGroups();
    }
}