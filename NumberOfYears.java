import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        long minutes = input.nextLong();

        long years = minutes / (60 * 24 * 365);
        long days = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println("It is " + years + " year(s) and " + days + " day(s).");
    }
}