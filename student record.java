import java.util.Scanner;
public class StudentRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[20];
        int[] attendance = new int[20];
        double[] marks = new double[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Attendance (in days): ");
            attendance[i] = scanner.nextInt();
            System.out.print("Marks (out of 100): ");
            marks[i] = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.println();
        }
        System.out.println("\n=== Student Records ===");
        for (int i = 0; i < 20; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Attendance: " + attendance[i] + " days");
            System.out.println("Marks: " + marks[i]);
            System.out.println("----------------------------");
        }
        scanner.close();
    }
}
