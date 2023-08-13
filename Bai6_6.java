package Buoi4;

import java.util.Scanner;

public class Bai6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            char firstCharacter = input.charAt(0);
            char lastCharacter = input.charAt(input.length() - 1);

            System.out.println("Ky tu dau tien trong chuoi: " + firstCharacter);
            System.out.println("Ky tu cuoi cung trong chuoi: " + lastCharacter);
        } else {
            System.out.println("Chuoi rong!");
        }

        scanner.close();

        System.out.println("\n=========Villain=========\n");
    }
}
