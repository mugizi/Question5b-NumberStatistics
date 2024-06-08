
package numberstatistics;
import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("WELCOME TO L&M LIMITTED \n");
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate product, sum, and maximum
        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int maximum = Math.max(num1, Math.max(num2, num3));

        // Display the result in tabular format
        System.out.println("Product\tSum\tMaximum");
        System.out.println(product + "\t" + sum + "\t" + maximum);

        scanner.close();
    }
}
