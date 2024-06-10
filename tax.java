import java.util.Scanner;

public class Main {
    private static double subtotalV;
    private static double taxPercentageV;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to read input from keyboard
        System.out.println("/////// Tax Calculator ///////");
        
        System.out.println("What's the subtotal?"); 
        subtotalV = scanner.nextDouble(); // Read and store the subtotal value
        
        System.out.println("What's the tax percentage?");
        taxPercentageV = scanner.nextDouble(); // Read and store the tax percentage value
        
        double convertTax = taxPercentageV * 0.01; // Convert tax percentage to decimal
        
        double total = subtotalV + (subtotalV * convertTax); // Calculate total
        System.out.println("Your total is " + Math.round(total * 100.0) / 100.0 + " after sales tax.");
        
        scanner.close();
    }
}