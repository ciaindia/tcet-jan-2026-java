import java.util.Scanner;

/**
 * CW6: WAP to create random jackpot number and
 * take input from user to guess
 * the number.
 * Medium – 10 attempts
 */

class Jackpot {
    public static void main(String[] args) {
        int jackpot = (int) (Math.random() * 100);
        boolean flag = false;

        for (int i = 0; i < 10; i++) {
            System.out.print("Guess a number[1-100]: ");
            int guess = new Scanner(System.in).nextInt();
            if (jackpot == guess) {
                System.out.println("You won");
                flag = true;
                break;
            }

            if (jackpot > guess)
                System.out.println("Jackpot is greater than " + guess);

            if (jackpot < guess)
                System.out.println("Jackpot is smaller than " + guess);
        }

        if (!flag)
            System.out.println("You lost");
    }
}
