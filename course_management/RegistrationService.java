package coursemanagement;
import java.util.ArrayList;
import java.util.Scanner;
public class RegistrationService {
    private ArrayList<Registration> registrations = new ArrayList<>();
    private CourseCatalog catalog = new CourseCatalog();
    public void registerCourse(Scanner sc) {
        System.out.println("\n--- New Course Registration ---");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        if (studentId.trim().isEmpty()) {
            System.out.println("Registration failed: Student ID cannot be empty.");
            return;
        }
        if (!studentId.matches("[0-9]+")) {
            System.out.println("Registration failed: Student ID must contain only numbers.");
            return;
        }
        for (Registration r : registrations) {
            if (r.getStudent().getStudentId().equalsIgnoreCase(studentId)) {
                System.out.println("Registration failed: This Student ID is already registered.");
                return;
            }
        }
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        if (studentName.trim().isEmpty()) {
            System.out.println("Registration failed: Student Name cannot be empty.");
            return;
        }
        if (!studentName.matches("[a-zA-Z ]+")) {
            System.out.println("Registration failed: Student Name must contain only letters.");
            return;
        }
        for (Registration r : registrations) {
            if (r.getStudent().getStudentName().equalsIgnoreCase(studentName)) {
                System.out.println("Registration failed: This Student Name is already registered.");
                return;
            }
        }
        catalog.printMenu();
        System.out.print("Enter choice: ");
        int courseChoice;
        try {
            courseChoice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Registration failed: Please enter a valid number.");
            return;
        }
        Course selectedCourse = catalog.getCourseByChoice(courseChoice);
        if (selectedCourse == null) {
            System.out.println("Registration failed: Invalid course choice.");
            return;
        }
        String mode = "";
        System.out.println("Select Mode:");
        System.out.println("1. Online");
        System.out.println("2. Offline");
        System.out.print("Enter choice: ");
        int modeChoice;
        try {
            modeChoice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Registration failed: Please enter a valid number.");
            return;
        }
        switch (modeChoice) {
            case 1:
                mode = "Online";
                break;
            case 2:
                mode = "Offline";
                break;
            default:
                System.out.println("Registration failed: Invalid mode choice. Must be 1 or 2.");
                return;
        }
        Course course = new Course(selectedCourse.getCourseName(), selectedCourse.getFees(),
                mode, selectedCourse.getDurationMonths());
        Student student = new Student(studentId, studentName);
        Registration registration = new Registration(student, course);
        registrations.add(registration);
        System.out.println("\nCourse registered successfully!");
    }
    public ArrayList<Registration> getRegistrations() {
        return registrations;
    }
}
