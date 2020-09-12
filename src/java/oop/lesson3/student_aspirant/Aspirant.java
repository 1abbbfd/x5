package oop.lesson3.student_aspirant;

public class Aspirant extends Student {
    private ScientificWork scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, ScientificWork scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public ScientificWork getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(ScientificWork scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    int getScholarship() {
        return super.averageMark == 5 ? 200 : 180;
    }
}
