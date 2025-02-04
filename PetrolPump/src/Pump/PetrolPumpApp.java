package Pump;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PetrolPumpApp {
    public static void main(String[] args) throws ParseException {
        PetrolPump petrolPump = new PetrolPump();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        while (true) {
            System.out.println("1. Add Fuel");
            System.out.println("2. Request Fuel");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter fuel type: ");
                    String fuelType = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    petrolPump.addFuel(new Fuel(fuelType, quantity));
                    break;
                case 2:
                    System.out.print("Enter fuel type: ");
                    String requestFuelType = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    double requestQuantity = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter date (dd-MM-yyyy): ");
                    String dateString = scanner.nextLine();
                    Date requestDate = sdf.parse(dateString);
                    if (petrolPump.requestFuel(requestFuelType, requestQuantity, requestDate)) {
                        System.out.println("Fuel request successful.");
                    } else {
                        System.out.println("Fuel request failed. Not enough fuel or invalid type.");
                    }
                    break;
                case 3:
                    System.out.print("Enter start date (dd-MM-yyyy): ");
                    String startDateString = scanner.nextLine();
                    Date startDate = sdf.parse(startDateString);
                    System.out.print("Enter end date (dd-MM-yyyy): ");
                    String endDateString = scanner.nextLine();
                    Date endDate = sdf.parse(endDateString);
                    ArrayList<Transaction> transactions = petrolPump.getTransactionsBetween(startDate, endDate);
                    System.out.println("Transactions between " + startDateString + " and " + endDateString + ":");
                    for (Transaction transaction : transactions) {
                        System.out.println(transaction);
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, Please try again.");
                    break;
            } // End of switch block
        } // End of while loop
    } // End of main method
} // End of class PetrolPumpApp
