import java.util.Random;
class RandomCode {
public static void main(String[] args) {
//generating random numbers between 1 and 6
Random rand = new Random();
int x = rand.nextInt((6-1)+1)+1;
System.out.println("Your number is: " + x);
}
}