package homework.javaintro.firsthomework;

import java.util.Scanner;

public class DaysInFeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga un an intre 1900 si 2016:");
        int year = scanner.nextInt();
        scanner.close();

        if (year < 1900 || year > 2016) {
            System.out.println("Te rog adauga un an intre 1900 si 2016:");
        } else {
            int daysInFebruary = getDaysInFebruary(year);
            System.out.println("Luna Februarie in " + year + " a avut " + daysInFebruary + " zile.");
        }
    }

    private static int getDaysInFebruary(int year) {
        if (LeapYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    private static boolean LeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}