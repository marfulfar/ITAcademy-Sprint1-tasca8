package student;

public class Student {

    private String name;
    private int age;
    private String course;
    private float mark;

    public Student(String name, int age, String course, float mark) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.mark = mark;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String grade) {
        this.course = course;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", mark=" + mark +
                '}';
    }
}
