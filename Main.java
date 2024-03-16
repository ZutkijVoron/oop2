import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        List<Student> studentList2 = new ArrayList<>();
        StudentGroup studentGroup2 = new StudentGroup(studentList2);
        Student student5 = new Student(5, "ccc", "ccc", "ccc");
        Student student6 = new Student(6, "ddd", "ddd", "ddd");
        Student student7 = new Student(7, "eee", "eee", "eee");
        Student student8 = new Student(8, "fff", "fff", "fff");
        studentGroup2.addStudent(student5);
        studentGroup2.addStudent(student6);
        studentGroup2.addStudent(student7);
        studentGroup2.addStudent(student8);
        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(studentGroup);
        listGroup.add(studentGroup2);
        Flow flow = new Flow(listGroup);
        for (StudentGroup group : flow) {
            for (Student student : group) {
                System.out.println(student);
            }
            System.out.println();
            System.out.println();
        }
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext())
        // System.out.println(iterator.next());
        // System.out.println();
        // for(Student student : studentGroup){
        // System.out.println(student);
    }
}
