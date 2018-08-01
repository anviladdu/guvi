/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ScannerValidateInput {
    public static void main(String[] args) {
        ScannerValidateInput demo = new ScannerValidateInput();
        demo.validatePositiveNumber();
    }

    private void validatePositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("no");
            }
            number = scanner.nextInt();
        } while (number < 0);

        System.out.printf("yes");
    }
}
