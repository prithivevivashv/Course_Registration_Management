import coursemanagement.RegistrationService;
import coursemanagement.RegistrationDisplayService;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistrationService registrationService = new RegistrationService();
        RegistrationDisplayService displayService = new RegistrationDisplayService();
        boolean running = true;
        while (running) {
            System.out.println("\n===== Course Registration Management System =====");
            System.out.println("1. Register for a Course");
            System.out.println("2. View Registered Course Details");
            System.out.println("3. View All Registrations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    registrationService.registerCourse(sc);
                    break;
                case 2:
                    displayService.displayCourseDetails(sc, registrationService.getRegistrations());
                    break;
                case 3:
                    displayService.displayAllRegistrations(registrationService.getRegistrations());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
        sc.close();
    }
}
