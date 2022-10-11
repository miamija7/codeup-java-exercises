package grades;
import java.util.ArrayList;

public class Student {
    // Variables/Fields
    private String name;
    ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Methods
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (double) total/grades.size();
    }


}
