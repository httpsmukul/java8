import java.util.*;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {
        System.out.println("yes");

        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student(5,"mukul","kumar","kolkata","english"));
        listOfStudent.add(new Student( 6,"Ayush","kumar","delhi","english"));
        listOfStudent.add(new Student( 8,"keishna","kumar","india","english"));

         listOfStudent.forEach(System.out::println);

        Collections.sort(listOfStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return 0;
            }
        });


    }
}
