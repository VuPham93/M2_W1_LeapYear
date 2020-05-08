import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isLeapYearBy4 = year % 4 == 0;
        if (isLeapYearBy4) {
            boolean isLeapYearBy100 = year % 100 == 0;
            if (isLeapYearBy100) {
                boolean isLeapYearBy400 = year % 400 == 0;
                if (isLeapYearBy400) {
                    isLeapYear = true;
                }
            }
            else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        }
        else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
