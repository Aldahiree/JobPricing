// JobPricing.java
// This program calculates a job estimate for the "Renew Your Home" Company.
import java.util.Scanner;
public class JobPricing {
    // Method to calculate job estimate
    public static double calculateEstimate(double materialsCost, double workHours, double travelHours) {
        double workCost = 35 * workHours;        // $35/hour for job work
        double travelCost = 12 * travelHours;    // $12/hour for travel
        return materialsCost + workCost + travelCost;
    }
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner for user input
        // Prompt the user for job information
        System.out.print("Enter the name of the job: ");
        String jobName = input.nextLine();
        System.out.print("Enter the cost of materials: ");
        double materialsCost = input.nextDouble();
        System.out.print("Enter the number of hours of work required: ");
        double workHours = input.nextDouble();
        System.out.print("Enter the number of hours of travel time: ");
        double travelHours = input.nextDouble();
        // Call method to calculate estimate
        double totalEstimate = calculateEstimate(materialsCost, workHours, travelHours);
        // Display the result
        System.out.printf("Job Name: %s\nEstimated Price: $%.2f\n", jobName, totalEstimate);
        input.close();
    }
}