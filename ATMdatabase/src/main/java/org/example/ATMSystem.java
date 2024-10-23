import java.sql.*;
import java.util.Scanner;

public class ATMSystem {
    private Connection conn;
    private String username;

    // Constructor to initialize the database connection
    public ATMSystem(String username, String password) {
        this.username = username;
        String url = "jdbc:mysql://localhost:3306/db_sgvu";
        String dbUser = "root";
        String dbPassword = "Amar@1161";

        try {
            // Establishing a connection
            conn = DriverManager.getConnection(url, dbUser, dbPassword);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method for fetching user balance from the database
    private double getUserBalance() {
        double userBalance = 0;
        try {
            String query = "SELECT balance FROM users WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                userBalance = rs.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBalance;
    }

    // Method for updating the user's balance in the database
    private void updateUserBalance(double newBalance) {
        try {
            String query = "UPDATE users SET balance = ? WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, newBalance);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method for withdrawing money
    public void withdraw(double amount) {
        double userBalance = getUserBalance();
        if (amount <= userBalance) {
            userBalance -= amount;
            updateUserBalance(userBalance);
            System.out.println("Withdrawal successful! Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds in your account.");
        }
    }

    // Method for depositing money
    public void deposit(double amount) {
        if (amount <= 50000) {
            double userBalance = getUserBalance();
            userBalance += amount;
            updateUserBalance(userBalance);
            System.out.println("Deposit successful! Amount deposited: " + amount);
        } else {
            System.out.println("Deposit limit exceeded! Maximum deposit amount is 50,000.");
        }
    }

    // Method to display current balances
    public void displayBalances() {
        double userBalance = getUserBalance();
        System.out.println("User balance: " + userBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for login credentials
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine(); // password handling can be improved in real systems

        // Correct object instantiation using the class name ATMSystem
        ATMSystem atm = new ATMSystem(username, password);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balances");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit (max 50,000): ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.displayBalances();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


