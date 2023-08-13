package Buoi4;

import java.util.Scanner;

public class Bai6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can ktra: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Chuoi la palindrome.");
        } else {
            System.out.println("Chuoi khong phai la palindrome.");
        }

        System.out.println("\n=========Villain=========\n");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
