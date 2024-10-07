import java.util.Scanner;

public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = Character.toUpperCase(size); 
    }

    @Override
    public String toString() {
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor = "small"; 
                break;
            case 'M':
                sizeDescriptor = "medium"; 
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "unknown size"; 
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car color: ");
        String color = scanner.nextLine();

        System.out.print("Enter car price: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Enter car size (S/M/L): ");
        char size = scanner.nextLine().toUpperCase().charAt(0); 

        Car car = new Car(color, price, size);
        System.out.println(car);
    }
}