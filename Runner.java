import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create the first Pet2 object using the default constructor
        Pet2 pet1 = new Pet2();
        System.out.println(pet1.toString());

        // Create the second Pet2 object using the custom constructor
        Pet2 pet2 = new Pet2("Dog", "Buster", 11);
        System.out.println(pet2.toString());

        // Create the third Pet2 object with user input
        System.out.print("Enter animal type: ");
        String type = scanner.nextLine();
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter animal age: ");
        int age = scanner.nextInt();

        // Create the third pet using the custom constructor with the user input
        Pet2 pet3 = new Pet2(type, name, age);
        System.out.println(pet3.toString());

        // Close the scanner
        scanner.close();
    }
}