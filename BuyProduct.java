import java.util.Scanner;

public class BuyProduct {
    public static void main(String[] args) {
         
         
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลสินค้า 3 รายการ
        System.out.print("Product #1 name: ");
        String item1 = scanner.nextLine();
        System.out.print("Product #1 price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); // เคลียร์ buffer

        System.out.print("Product #2 name: ");
        String item2 = scanner.nextLine();
        System.out.print("Product #2 name: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #3 name: ");
        String item3 = scanner.nextLine();
        System.out.print("Product #3 name: ");
        double price3 = scanner.nextDouble();
        scanner.nextLine();

        // รับจำนวนเงินที่ลูกค้าจ่าย
        System.out.print("Customer paid money : ");
        double paid = scanner.nextDouble();

        // คำนวณราคารวม, ภาษี, ราคารวมสุทธิ และเงินทอน
        double subtotal = price1 + price2 + price3;
        double vat = subtotal * 0.07;
        double total = subtotal + vat;
        double change = paid - total;

        // แสดงผล
        System.out.println("\n----- Receipt -----");
        System.out.println(item1 + ": " + price1 + " baht");
        System.out.println(item2 + ": " + price2 + " baht");
        System.out.println(item3 + ": " + price3 + " baht");
        System.out.println("Total price before tax: " + subtotal + " baht");
        System.out.printf("VAT = %.2f baht\n", vat);
        System.out.println("Net price " + total + " baht");
        System.out.println("Totol paid " + paid + " baht");
        System.out.printf("Change = %.2f baht\n", change);
    }
}

