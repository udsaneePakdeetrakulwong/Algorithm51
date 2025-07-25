import java.util.Scanner;
public class AreaCircleInput {
    public static void main(String args[]) {
        System.out.print("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        // double radius = scanner.nextDouble();
        // double areaCircle = 3.14 * radius * radius; 

         float radius = scanner.nextFloat();
         
         float areaCircle = 3.14f * radius * radius;       
        System.out.println("Area of Circle with radius = " + radius + " is: " + areaCircle);
    }
}