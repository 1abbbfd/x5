package oop.lesson3.student_aspirant;

public class Aspirant extends Student {

    @Override
    int getScholarship() {
        return super.averageMark == 5 ? 200 : 180;
    }
}
