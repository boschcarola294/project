public class SimpleJavaProject {
    public static void main(String[] args) {
        // Example 1: Simple Java program
        System.out.println("Hello, World!");

        // Example 2: Function to check if a number is even or odd
        int num = 10;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // Example 3: Simple loop for iteration
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        // Example 4: Recursive function to calculate factorial
        int n = 5;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            result *= i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
