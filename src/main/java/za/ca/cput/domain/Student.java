package za.ca.cput.domain;

public class Student {
    private String studentNumber;
    private String studentFirstName;
    private String studentLastName;
    private String course;

    public Student() {
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
