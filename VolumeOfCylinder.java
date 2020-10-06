import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        
        final double pi = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        int radius = input.nextInt();

        System.out.print("Enter a height: ");
        int height = input.nextInt();

        double area = radius * radius * pi;
        double volume = area * height;

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);

    }
}