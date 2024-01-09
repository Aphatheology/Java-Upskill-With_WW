package aphatheology;

import java.util.Scanner;

public class DuplicateEntry {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        int[] uniqueNumbers = new int[ARRAY_SIZE];
        int currentIndex = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers between 10 and 100 (inclusive):");

        while (currentIndex < ARRAY_SIZE) {
            System.out.print("Enter number #" + (currentIndex + 1) + ": ");
            int inputNumber = scanner.nextInt();

            if (inputNumber >= 10 && inputNumber <= 100) {
                if (!contains(uniqueNumbers, currentIndex, inputNumber)) {
                    uniqueNumbers[currentIndex] = inputNumber;
                    currentIndex++;

                    System.out.print("Unique values so far: ");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.print(uniqueNumbers[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Duplicate number. Please enter a different number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 10 and 100.");
            }
        }

        System.out.println("You have entered five unique numbers. Program complete.");
    }

    private static boolean contains(int[] array, int index, int number) {
        for (int i = 0; i < index; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
