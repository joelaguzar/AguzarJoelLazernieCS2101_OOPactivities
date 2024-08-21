import java.util.Scanner;

public class Escseq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of multiples: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            // Calculate the multiple of 7
            int multiple = i * 7;

            if (i % 2 == 0) {
                System.out.print("\t");
            }

            System.out.println(multiple);
        }

        scanner.close();
    }
}