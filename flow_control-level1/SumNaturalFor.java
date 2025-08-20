import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Both results are " + (sumFormula == sumLoop ? "Correct ✅" : "Incorrect ❌"));
        } else {
            System.out.println("Not a natural number!");
        }
    }
}
