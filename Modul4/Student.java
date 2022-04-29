
/**
 * Write a description of class Student here.
 *
 * @author William
 * @version 1
 */
public class Student extends Person
{
    private String universityName;
    private int numberOfSubjects;

    /**
     * Constructor for objects of class Student
     */
    public Student(int age, String name, String universityName, int numberOfSubjects)
    {
        super(age, name);
        this.universityName = universityName;
        this.numberOfSubjects = numberOfSubjects;
    }
    
    // adds one subject to the students course tracker
    public void act() {
        this.numberOfSubjects += 1;
    }
    

    public void shareStudentInfo() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(universityName);
        System.out.println(numberOfSubjects);
    }
}
