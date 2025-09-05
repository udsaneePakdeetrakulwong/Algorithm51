import java.util.Scanner;

public class BuyProduct2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input product 1
        System.out.print("Product 1 name: ");
        String item1 = scanner.nextLine();
        System.out.print("Product 1 price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        // Input product 2
        System.out.print("Product 2 name: ");
        String item2 = scanner.nextLine();
        System.out.print("Product 2 price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        // Input product 3
        System.out.print("Product 3 name: ");
        String item3 = scanner.nextLine();
        System.out.print("Product 3 price: ");
        double price3 = scanner.nextDouble();

        // Input amount paid
        System.out.print("Amount paid by customer: ");
        double paid = scanner.nextDouble();

        // Calculations
        double subtotal = price1 + price2 + price3;
        double vat = subtotal * 0.07;
        double totalBeforeDiscount = subtotal + vat;
        double discount = totalBeforeDiscount * 0.10;
        double finalTotal = totalBeforeDiscount - discount;
        double change = paid - finalTotal;

        // Output
        System.out.println("\n----- Receipt -----");
        System.out.println(item1 + ": " + price1 + " Baht");
        System.out.println(item2 + ": " + price2 + " Baht");
        System.out.println(item3 + ": " + price3 + " Baht");
        System.out.println("Subtotal: " + subtotal + " Baht");
        System.out.println("VAT 7%: " + vat + " Baht");
        System.out.println("Total before discount: " + totalBeforeDiscount + " Baht");
        System.out.println("Discount 10%: " + discount + " Baht");
        System.out.println("Final amount to pay: " + finalTotal + " Baht");
        System.out.println("Amount paid: " + paid + " Baht");
        System.out.println("Change: " + change + " Baht");
    }
}

