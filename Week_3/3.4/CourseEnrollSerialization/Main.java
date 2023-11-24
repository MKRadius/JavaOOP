import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "[Student|ID: " + this.id + "|Name: " + this.name + "|Age: " + this.age + "]";
    }
}

class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getInstructor() {
        return this.instructor;
    }

    @Override
    public String toString() {
        return "[Course|Code: " + this.courseCode + "|Name: " + this.courseName + "|Intructor: " + this.instructor + "]"; 
    }
}

class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Course getCourse() {
        return this.course;
    }

    public Student getStudent() {
        return this.student;
    }

    public String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment: " + this.student + " - " + this.course + " - [Date: " + this.enrollmentDate + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Student", 20);
        Course course = new Course("C1", "OOP", "Intructor");
        Enrollment enrollment = new Enrollment(student, course, "24112023");

        File file = new File("enrollments.ser");

        try {
            FileOutputStream fileOut = new FileOutputStream(file.getName());
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(enrollment);
            objectOut.close();
            fileOut.close();
            
            System.out.println("Serialized data saved at " + file.getAbsolutePath());
        } catch (IOException err) {
            err.printStackTrace();
        }

        if (file.exists() && file.isFile()) {
            try {
                FileInputStream fileIn = new FileInputStream(file.getName());
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);

                Enrollment deserializedEnrollment = (Enrollment) objectIn.readObject();
                objectIn.close();
                fileIn.close();
    
                System.out.println(deserializedEnrollment);
            }
            catch (Exception excp) {
                System.err.println(excp);
            }
        }
        else {
            System.out.println("File not found");
        }
    }
}
