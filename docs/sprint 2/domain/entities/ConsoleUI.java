package presentation.ui;

import domain.entities.DateRange;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);

    public String getSymbol() {
        System.out.print("Enter stock symbol: ");
        return scanner.nextLine();
    }

    public String getCompanyName() {
        System.out.print("Enter company name: ");
        return scanner.nextLine();
    }

    public DateRange getDateRange() {
        System.out.print("Enter start date (yyyy-mm-dd): ");
        LocalDate start = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter end date (yyyy-mm-dd): ");
        LocalDate end = LocalDate.parse(scanner.nextLine());

        return new DateRange(start, end);
    }
}
