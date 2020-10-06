import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Celsius degree: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("It is " + fahrenheit + " degrees Fahrengeit.");

    }

}