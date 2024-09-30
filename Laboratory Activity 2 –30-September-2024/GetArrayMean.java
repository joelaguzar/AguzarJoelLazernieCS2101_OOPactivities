import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        
        for (int ctr = 0; ctr < n; ctr++){
            System.out.print("Enter number: ");
            numbers[ctr] = input.nextInt();
        }

        double mean = getArrayMean(numbers);

        System.out.println("Mean of array is: " + String.format("%.2f", mean));

        input.close();
    }
        
        public static double getArrayMean (int[] arr){
            int sum = 0;
            for (int num: arr){
                sum += num;
            }
            return (double) sum / arr.length;
        }      
}