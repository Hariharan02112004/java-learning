//Armstrong_number or Narcissistic number
import java.util.Scanner;

class Armstrong_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); // Raise digit to power of total digits
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
