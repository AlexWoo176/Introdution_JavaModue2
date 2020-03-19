package day.is.month;

import java.util.Scanner;

public class DayIsMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        System.out.print("Enter Month is Check: ");
        int month = sc.nextInt();
        String dayIsMonth;
        switch (month) {
            case 2:
                dayIsMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
        }
        if (dayIsMonth != "") {
            System.out.printf("The Number of days in %d has %s days", month, dayIsMonth);
        } else {
            System.out.print("Invalid Input!");
        }
    }
}
