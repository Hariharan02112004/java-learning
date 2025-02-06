import java.util.Scanner;

class GCD_cal {
    int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }
}

class gcd_euclidean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GCD_cal G = new GCD_cal();

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int result = G.GCD(a, b); // Fixed typo here

        System.out.println("The GCD of " + a + " & " + b + " is " + result);

        input.close(); // Closing scanner
    }
}
