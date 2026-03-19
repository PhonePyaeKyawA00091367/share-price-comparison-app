package ui;

import java.util.Scanner;

public class ConsoleUI {

    private Scanner sc = new Scanner(System.in);

    public String getSymbol() {
        System.out.print("Enter Symbol: ");
        return sc.nextLine();
    }

    public String getStart() {
        System.out.print("Start Date: ");
        return sc.nextLine();
    }

    public String getEnd() {
        System.out.print("End Date: ");
        return sc.nextLine();
    }
}
