import java.util.*;

public class RandomCode {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = sc.nextInt();
int randomNum = (int)(Math.random() * num) + 1;
System.out.println("The random number is " + randomNum);
}
}