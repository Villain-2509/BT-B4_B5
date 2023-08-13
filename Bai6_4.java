package Buoi4;

import java.util.Scanner;

public class Bai6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao sau: ");
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        System.out.println("Ket qua: " + result.toString().trim());

        System.out.println("\n=========Villain=========\n");
    }
}
