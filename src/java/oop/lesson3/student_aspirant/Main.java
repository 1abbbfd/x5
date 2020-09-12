package oop.lesson3.student_aspirant;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(
                "Ivan",
                "Ivanov",
                "group_student",
                5
        );
        Aspirant aspirant = new Aspirant(
                "Vasya",
                "Vasiliev",
                "grop_asp",
                5,
                new ScientificWork("topic", "text")
        );
        student.setAverageMark(5);
        aspirant.setAverageMark(5);
        Student[] students = new Student[]{student, aspirant};

        for (Student i : students) {
            System.out.println(i.getFirstName() + " "
                    + i.getLastName() + " "
                    + i.getGroup() + " "
                    + i.getScholarship() + "");
        }
    }
}
