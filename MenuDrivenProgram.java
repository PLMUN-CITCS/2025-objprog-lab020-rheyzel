import java.util.Scanner;

public class MenuDrivenProgram {

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the menu choice and perform corresponding actions
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();  // Call greetUser() if choice is 1
                break;
            case 2:
                checkEvenOrOdd();  // Call checkEvenOrOdd() if choice is 2
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");  // Exit message if choice is 3
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option (1-3).");  // Error message for invalid choice
        }
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {  // Check for valid integer input
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();  // Discard invalid input
        }
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to continuously display the menu and process user choices
        do {
            displayMenu();  // Show the menu
            System.out.print("Enter your choice (1-3): ");
            
            // Validate the user input choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next();  // Discard invalid input
            }
            choice = scanner.nextInt();

            handleMenuChoice(choice);  // Process the user's choice
        } while (choice != 3);  // Continue looping until the user chooses to exit
    }
}
