public class SimpleProject {
    public static void main(String[] args) {
        // Example 1: Add two numbers
        int sum = 5 + 3;
        System.out.println("The sum of 5 and 3 is: " + sum);

        // Example 2: Print a message with variable values
        String greeting = "Hello, ";
        greeting += "World!";
        System.out.println(greeting);

        // Example 3: Sort an array of integers
        int[] numbers = {10, 5, -3, 7, 9};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Example 4: Print the first and last character of a string
        String text = "Hello";
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(text.length() - 1);
        System.out.println("First character: " + firstChar + ", Last character: " + lastChar);

        // Example 5: Print the sum of two integers
        int num1 = 4;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
