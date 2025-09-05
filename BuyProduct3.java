import java.util.Scanner;

public class BuyProduct3 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter product 1 price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter quantity for product 1: ");
        int qty1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter product 2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter product 2 price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter quantity for product 2: ");
        int qty2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter product 3 name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter product 3 price: ");
        double price3 = scanner.nextDouble();
        System.out.print("Enter quantity for product 3: ");
        int qty3 = scanner.nextInt();

        System.out.print("Enter amount paid: ");
        double paid = scanner.nextDouble();

        double total1 = price1 * qty1;
        double total2 = price2 * qty2;
        double total3 = price3 * qty3;
        double subtotal = total1 + total2 + total3;
        double vat = subtotal * 0.07;
        double total = subtotal + vat;
        double change = paid - total;

        System.out.println("\n----- Receipt -----");
        System.out.printf("%s: %.2f x %d = %.2f Baht\n", name1, price1, qty1, total1);
        System.out.printf("%s: %.2f x %d = %.2f Baht\n", name2, price2, qty2, total2);
        System.out.printf("%s: %.2f x %d = %.2f Baht\n", name3, price3, qty3, total3);
        System.out.printf("Subtotal: %.2f Baht\n", subtotal);
        System.out.printf("VAT 7%%: %.2f Baht\n", vat);
        System.out.printf("Total including VAT: %.2f Baht\n", total);
        System.out.printf("Amount paid: %.2f Baht\n", paid);
        System.out.printf("Change: %.2f Baht\n", change);
    }
}