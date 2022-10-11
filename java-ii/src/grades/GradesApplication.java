package grades;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student spongebob = new Student("Spongebob");
        spongebob.addGrade(97);
        spongebob.addGrade(74);
        spongebob.addGrade(58);

        Student squidward = new Student("Squidward");
        squidward.addGrade(34);
        squidward.addGrade(76);
        squidward.addGrade(65);

        Student patrick = new Student("Patrick");
        patrick.addGrade(100);
        patrick.addGrade(94);
        patrick.addGrade(23);

        Student sandy = new Student("Sandy");
        sandy.addGrade(85);
        sandy.addGrade(99);
        sandy.addGrade(86);

        students.put("square_pants", spongebob);
        students.put("tentacles", squidward);
        students.put("star", patrick);
        students.put("cheeks", sandy);

        // Commandline Interface
        for ( String key : students.keySet() ) {
            System.out.printf( "|%s| ", key);
        }
    }
}
