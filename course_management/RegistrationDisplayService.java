package coursemanagement;
import java.util.ArrayList;
import java.util.Scanner;
public class RegistrationDisplayService {
    public void displayCourseDetails(Scanner sc, ArrayList<Registration> registrations) {
        System.out.println("\n--- View Registered Course Details ---");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        boolean found = false;
        for (Registration r : registrations) {
            if (r.getStudent().getStudentId().equalsIgnoreCase(studentId) && r.getStudent().getStudentName().equalsIgnoreCase(studentName)) {
                r.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No registration found for the given Student ID and Name.");
        }
    }
    public void displayAllRegistrations(ArrayList<Registration> registrations) {
        System.out.println("\n--- All Registered Students ---");
        if (registrations.isEmpty()) {
            System.out.println("No registrations yet.");
            return;
        }
        for (Registration r : registrations) {
            r.displayDetails();
        }
    }
}
