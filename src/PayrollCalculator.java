import java.util.*;

public class PayrollCalculator {

    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        double weeklyPay = 0.0;

        if (hoursWorked < 0 || hourlyRate < 0) {
            return 0.0;
        }

        switch (employeeType) {
            case "FULL_TIME":
                if (hoursWorked <= 40) {
                    weeklyPay = hoursWorked * hourlyRate;
                } else {
                    weeklyPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
                }
                break;

            case "PART_TIME":
                if (hoursWorked <= 25) {
                    weeklyPay = hoursWorked * hourlyRate;
                }
                break;

            case "CONTRACTOR":
                weeklyPay = hoursWorked * hourlyRate;
                break;

            case "INTERN":
                if (hoursWorked <= 20) {
                    weeklyPay = hoursWorked * hourlyRate * 0.8;
                }
                break;

            default:
                weeklyPay = 0.0;
        }

        return weeklyPay;
    }

    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double tax = 0.0;

        if (hasHealthInsurance) {
            if (0 <= grossPay && grossPay <= 500) {
                tax = 0.1 * grossPay - 50;
            } else if (grossPay <= 1000) {
                tax = 0.15 * grossPay - 50;
            } else if (grossPay <= 2000) {
                tax = 0.2 * grossPay - 50;
            } else {
                tax = 0.25 * grossPay - 50;
            }
        } else {
            if (0 <= grossPay && grossPay <= 500) {
                tax = 0.1 * grossPay;
            } else if (grossPay <= 1000) {
                tax = 0.15 * grossPay;
            } else if (grossPay <= 2000) {
                tax = 0.2 * grossPay;
            } else {
                tax = 0.25 * grossPay;
            }
        }

        return Math.max(tax, 0.0);
    }

    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) {
        int n = Math.min(Math.min(employeeTypes.length, hours.length), Math.min(rates.length, names.length));
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        double total = 0.0;
        int countOvertime = 0;
        String highestName = "";
        String lowestName = "";

        System.out.printf("%-10s %-12s %-8s %-8s %-10s%n", "Name", "Type", "Hours", "Rate", "Pay");

        for (int i = 0; i < n; i++) {
            double pay = calculateWeeklyPay(employeeTypes[i], hours[i], rates[i]);
            System.out.printf("%-10s %-12s %-8.1f %-8.2f %-10.2f%n", names[i], employeeTypes[i], hours[i], rates[i], pay);

            total += pay;
            if (pay > highest) {
                highest = pay;
                highestName = names[i];
            }
            if (pay < lowest) {
                lowest = pay;
                lowestName = names[i];
            }
            if (hours[i] > 40) {
                countOvertime++;
            }
        }

        double average = total / n;
        System.out.println();
        System.out.printf("Highest Paid: %s (%.2f)%n", highestName, highest);
        System.out.printf("Lowest Paid: %s (%.2f)%n", lowestName, lowest);
        System.out.printf("Average Pay: %.2f%n", average);
        System.out.printf("Employees with Overtime (>40 hrs): %d%n", countOvertime);
    }

    public static void main(String[] args) {
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        processPayroll(types, hours, rates, names);
    }
}
