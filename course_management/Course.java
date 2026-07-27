package coursemanagement;
public class Course {
        private String courseName;
        private double fees;
        private String mode;
        private int durationMonths;
        public Course(String courseName, double fees, String mode, int durationMonths) {
            this.courseName = courseName;
            this.fees = fees;
            this.mode = mode;
            this.durationMonths = durationMonths;
        }
        public String getCourseName() {

            return courseName;
        }
        public double getFees() {

            return fees;
        }
        public String getMode() {

            return mode;
        }
        public int getDurationMonths() {

            return durationMonths;
        }
    }

