import java.util.Scanner;

public class CO4Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = scanner.nextInt();

        try {
            double average = calculateAverage(n);
            System.out.println("Average: " + average);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double calculateAverage(int n) throws NegativeNumberException {
        if (n <= 0) {
            throw new NegativeNumberException("N should be a positive integer.");
        }

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a positive integer: ");
            int num = scanner.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative number found: " + num);
            }

            sum += num;
        }

        return (double) sum / n;
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
