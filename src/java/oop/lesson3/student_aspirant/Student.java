package oop.lesson3.student_aspirant;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
