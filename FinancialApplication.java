import java.util.Scanner;

public class FinancialApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: $");
        int subtotal = input.nextInt();

        System.out.print("Enter the gratuity rate: $");
        byte gratuityRate = input.nextByte();

        double gratuity = subtotal * gratuityRate / 100.0;
        double total = subtotal + gratuity;

        System.out.println("Total: $" + total);
        System.out.println("Gratuity: $" + gratuity);

    }
}