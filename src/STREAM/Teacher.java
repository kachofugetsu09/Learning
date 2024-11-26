package STREAM;

public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;
    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public int compareTo(Teacher o) {
        return this.age-o.age;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
