package OOP.Lab01;
import java.util.Scanner;


public class DaysInMonth {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String monthInput;
            int yearInput = -1;
            int monthNumber = 0;

            String reinputString = "Xin moi nhap lai";
            


            while (true) {
                System.out.print("Nhap thang: ");
                monthInput = scanner.nextLine();
                monthNumber = getMonthNumber(monthInput);
                if (monthNumber != -1) {
                    break;
                } else {
                    System.out.println(reinputString);
                }
            }

            while (true) {
                System.out.print("Nhap nam: ");
                try {
                    yearInput = Integer.parseInt(scanner.nextLine().trim());
                    if (yearInput >= 0 && String.valueOf(yearInput).length() == 4) {
                        break;
                    } else {
                        System.out.println(reinputString);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(reinputString);
                }
            }
            
            int days = getDaysInMonth(monthNumber, yearInput);
            System.out.println("So ngay trong thang la:  " + days);
        }
    }

    public static int getMonthNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january": case "jan": case "jan." : case "1": return 1;
            case "february": case "feb": case "feb." : case "2": return 2;
            case "march": case "mar": case "mar." : case "3": return 3;
            case "april": case "apr": case "apr." : case "4": return 4;
            case "may": case "may.": case "5": return 5;
            case "june": case "jun": case "jun." : case "6": return 6;
            case "july": case "jul": case "jul." : case "7": return 7;
            case "august": case "aug": case "aug." : case "8": return 8;
            case "september": case "sep": case "sept.": case "9": return 9;
            case "october": case "oct": case "oct." : case "10": return 10;
            case "november": case "nov": case "nov." : case "11": return 11;
            case "december": case "dec": case "dec." : case "12": return 12;
            default: return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}


