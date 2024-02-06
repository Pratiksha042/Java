import java.util.ArrayList;
import java.util.Scanner;
 
public class ToDoList {
    
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ToDo List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added successfully.");
                    break;
                case 2:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Current ToDo List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        System.out.print("Enter the item number to remove: ");
                        int itemToRemove = scanner.nextInt();
                        if (itemToRemove > 0 && itemToRemove <= toDoList.size()) {
                            toDoList.remove(itemToRemove - 1);
                            System.out.println("Item removed successfully.");
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    } else {
                        System.out.println("ToDo List is empty. Nothing to remove.");
                    }
                    break;
                case 3:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Current ToDo List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    } else {
                        System.out.println("ToDo List is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting ToDo List application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}

