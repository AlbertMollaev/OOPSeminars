import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>(105));
        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>(122));
        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>(105));
        StudentGroup studentGroup4 = new StudentGroup(new ArrayList<>(125));
        StudentGroup studentGroup5 = new StudentGroup(new ArrayList<>(200));

        Stream streamOne = new Stream("streame1", new ArrayList<>());
        streamOne.addStudentGroup(studentGroup1);
        streamOne.addStudentGroup(studentGroup2);
        streamOne.addStudentGroup(studentGroup3);
        streamOne.addStudentGroup(studentGroup4);
        streamOne.addStudentGroup(studentGroup5);

        Stream streamTwo = new Stream("streame2", new ArrayList<>());
        streamTwo.addStudentGroup(studentGroup1);
        streamTwo.addStudentGroup(studentGroup2);

        Stream streamThree = new Stream("streame3", new ArrayList<>());
        streamThree.addStudentGroup(studentGroup1);

        StreamService streamService = new StreamService(Arrays.asList(streamOne, streamTwo, streamThree));
        for (Stream stream: streamService.getSortedStreamBySize()){
            System.out.println(stream);
        }

        // StudentGroupService service = new StudentGroupService(studentGroup);
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroup()) {
        //     System.out.println(student);
        // }
        // System.out.println();
        // for (Student student : service.getSortedStudentGroupByFIO()) {
        //     System.out.println(student);
        // }
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(Student student : studentGroup){
//            System.out.println(student);
    }
}