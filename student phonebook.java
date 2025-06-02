import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        System.out.println("=== Enter details for 20 students ===");
        for (int i = 1; i <= 20; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            while (phoneBook.containsKey(name)) {
                System.out.println("Name already exists. Please enter a unique name:");
                name = scanner.nextLine();
            }
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        System.out.println("\n=== Student Phonebook ===");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey());
            System.out.println("Phone Number: " + entry.getValue());
            System.out.println("-----------------------------");
        }
        scanner.close();
    }
}
