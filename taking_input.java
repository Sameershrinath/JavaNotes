import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Taking a full sentence as input (including spaces)
        System.out.println("Enter your name: ");
        String sentence = scanner.nextLine();
        
        // Taking a single word input (without spaces)
        System.out.println("Enter a branch: ");
        String word = scanner.next();  // next() is used for a single word
        
        // Taking an integer input
        System.out.println("Enter an sid: ");
        int number = scanner.nextInt();
        
        // Taking a floating-point input
        System.out.println("Enter your marks: ");
        float decimal = scanner.nextFloat();
        
        // Taking a character input
        System.out.println("Enter your section: ");
        char character = scanner.next().charAt(0);  // charAt(0) extracts the first character
        
        // Display all the inputs
        System.out.println("You entered the name: " + sentence);
        System.out.println("You entered the branch: " + word);
        System.out.println("You entered the sid: " + number);
        System.out.println("You entered the marks: " + decimal);
        System.out.println("You entered the section: " + character);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
