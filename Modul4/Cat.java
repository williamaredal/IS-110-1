
/**
 * Write a description of class Cat here.
 *
 * @author William
 * @version 1
 */
public class Cat extends Animal
{
    private String name;
    private int age;
    private String nickname;

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String name, int age)
    {
        super(true);
        this.name = name;
        this.age = age;

    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println("Eating carefully");
    }
}
