package coursemanagement;
public class CourseCatalog {
        private static final String[] COURSE_NAMES = {"Java Programming", "Data Structures And Algorithm ", "Web Development (Full Stack)", "Cloud Computing", "Database Management Systems"};
        private static final double[] COURSE_FEES = {4999, 5999, 7999, 3999, 4499};
        private static final int[] COURSE_DURATIONS = {3, 4, 6, 2, 3};
        public void printMenu() {
            System.out.println("\nSelect a Course:");
            for (int i = 0; i < COURSE_NAMES.length; i++) {
                System.out.println((i + 1) + ". " + COURSE_NAMES[i] + " | Fees: " + COURSE_FEES[i] + " | Duration: " + COURSE_DURATIONS[i] + " month's");
            }
        }
        public Course getCourseByChoice(int choice) {
            int index = choice - 1;
            if (index < 0 || index >= COURSE_NAMES.length) {
                return null;
            }
            return new Course(COURSE_NAMES[index], COURSE_FEES[index], "", COURSE_DURATIONS[index]);
        }
}

