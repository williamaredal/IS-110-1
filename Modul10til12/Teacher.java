package Modul10til12;

/**
 *
 * @author William
 * @version 1
 */
public class Teacher extends Person
{
    private String fieldOfExpertice;
    private int coursesTaught;
    private int yearsTaught;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher(int age, String name, String fieldOfexpertice, int coursesTaught, int yearsTaught)
    {
        super(age, name);
        this.fieldOfExpertice = fieldOfexpertice;
        this.coursesTaught = coursesTaught;
        this.yearsTaught = yearsTaught;
    }

    // adds one year to the teacher number of years taught
    public void act() {
        this.age += 1;
        this.yearsTaught += 1;
    }
    

    public void showTeacherBio() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(fieldOfExpertice);
        System.out.println(coursesTaught);
        System.out.println(yearsTaught);
    }
}
