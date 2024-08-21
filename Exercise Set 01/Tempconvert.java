import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] argas) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("\nEnter your choice (1 or 2): ");

        int choice = input.nextInt();

        double temp, convertedTemp;

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius temperature: ");
                temp = input.nextDouble();
                convertedTemp = (temp * 9 / 5) + 32;
                System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", temp, convertedTemp);
                break;
            case 2:
                System.out.print("Enter Fahrenheit temperature: ");
                temp= input.nextDouble();
                convertedTemp = (temp - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius\n", temp, convertedTemp);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}