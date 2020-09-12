package oop.lesson3.student_aspirant;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
