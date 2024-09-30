import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();

        int table [][] = generateMultiplicationTable(size);
        printMultiplicationTable(table);

        input.close();
    }

    public static int[][] generateMultiplicationTable(int size) {
        int[][] table = new int[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }
        return table;  
    }
    
    public static void printMultiplicationTable(int[][] table){
        int size = table.length;

        System.out.println("Multiplication Table:");

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.printf("%4d", table[row][col]);
            }
            System.out.println();
            }
        }
}
