import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println("Hello, it's Guessing Number Game!");
        System.out.println("Select the difficulty level");
        System.out.println("1. Easy, 10 chances");
        System.out.println("2. Medium, 5 chances");
        System.out.println("3. Hard, 2 chances");
        int difficulty = input.nextInt();
        if (difficulty == 1) {
            for (int i = 1; i <= 10; i++) {
                int guess = input.nextInt();
                if (guess == num) {
                    System.out.println("You right!");
                    break;
                }
                if (guess <= num) {
                    System.out.println("Fuck! The number more than " + guess);
                } else {
                    System.out.println("Fuck! The  number less than " + guess);
                }
            }
        }
        if (difficulty == 2) {
            for (int i = 1; i <= 5; i++) {
                int guess = input.nextInt();
                if (guess == num) {
                    System.out.println("You right!");
                    break;
                }
                if (guess <= num) {
                    System.out.println("Fuck! The number more than " + guess);
                } else {
                    System.out.println("Fuck! The  number less than " + guess);
                }
            }
            if (difficulty == 3) {
                for (int i = 1; i <= 2; i++) {
                    int guess = input.nextInt();
                    if (guess == num) {
                        System.out.println("You right!");
                        break;
                    }
                    if (guess <= num) {
                        System.out.println("Fuck! The number more than " + guess);
                    } else {
                        System.out.println("Fuck! The  number less than " + guess);
                    }
                }

            }

        }
    }
}