import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (5>4) {
            if (input.equals("exit")) {
                break;
            }
            else{
                System.out.println("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
            }
        }

        scanner.close();

        breakExample();
        continueExample();
        whileBreakExample();
        whileContinueExample();

    }

    public static void breakExample() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }
        System.out.println("break example ended");

    }

    public static void continueExample() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println("i: " + i);
        }
        System.out.println("continue example ended");

    }

    public static void whileBreakExample() {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("while break example ended");

    }

    public static void whileContinueExample() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue; // Skip the current iteration if i is even
            }
            System.out.println("i: " + i);
        }
        System.out.println("while continue example ended");

    }
    
}
