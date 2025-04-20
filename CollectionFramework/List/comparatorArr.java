package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double cgpa;

    public Student(String name,double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }
}
public class comparatorArr {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", 9.9));
        students.add(new Student("Bablu", 9.9));
        students.add(new Student("Vikrant",8.8));
        students.add(new Student("Sammi",9.7));

        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);
        for(Student stu : students){
            System.out.println(stu.getName() + " : " + stu.getCgpa());
        }
    }
}
