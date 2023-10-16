import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoAppColor {

    private static List<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // ANSI escape codes for colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        while (true) {
            System.out.println(ANSI_BLUE + "=== To-Do List App ===" + ANSI_RESET);
            System.out.println("1. View tasks");
            System.out.println("2. Add task");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewTasks();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println(ANSI_GREEN + "Invalid choice. Please try again." + ANSI_RESET);
            }
        }
    }

    // ... [Rest of the code remains the same] ...
}
