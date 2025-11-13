import java.util.Scanner;
#webhook check 2
public class Pricecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount rate (e.g., 0.10 for 10%): ");
        double discountRate = sc.nextDouble();

        System.out.print("Enter tax rate (e.g., 0.18 for 18%): ");
        double taxRate = sc.nextDouble();

        // Calculate base price
        double basePrice = unitPrice * quantity;

        // Apply discount
        double discount = basePrice * discountRate / 100;
        double priceAfterDiscount = basePrice - discount;

        // Apply tax
        double tax = priceAfterDiscount * taxRate / 100;
        double finalPrice = priceAfterDiscount + tax;

        // Output
        System.out.println("\n--- Price Details ---");
        System.out.printf("Base Price: ₹%.2f%n", basePrice);
        System.out.printf("Discount: ₹%.2f%n", discount);
        System.out.printf("Price after Discount: ₹%.2f%n", priceAfterDiscount);
        System.out.printf("Tax: ₹%.2f%n", tax);
        System.out.printf("Final Price: ₹%.2f%n", finalPrice);

        sc.close();
    }
}
