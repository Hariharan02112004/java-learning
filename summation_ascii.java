import java.util.Scanner;

public class summation_ascii{
    public static void main(String args[]) {
        Scanner d = new Scanner(System.in);
        String s = d.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        System.out.println(sum);
    }
}