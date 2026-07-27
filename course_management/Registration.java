package coursemanagement;
public class Registration {
        private Student student;
        private Course course;
        public Registration(Student student, Course course) {
            this.student = student;
            this.course = course;
        }
        public Student getStudent() {
            return student;
        }
        public Course getCourse() {
            return course;
        }
        public void displayDetails() {
            System.out.println("------------------------------------------");
            System.out.println("Student ID     : " + student.getStudentId());
            System.out.println("Student Name   : " + student.getStudentName());
            System.out.println("Course Name    : " + course.getCourseName());
            System.out.println("Registration Fee: " + course.getFees());
            System.out.println("Mode           : " + course.getMode());
            System.out.println("Duration       : " + course.getDurationMonths() + " month(s)");
            System.out.println("------------------------------------------");
        }
    }

