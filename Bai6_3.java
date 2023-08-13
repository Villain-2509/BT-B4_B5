package Buoi4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi so: ");
        String input = scanner.nextLine();
        
        try {
            long number = Long.parseLong(input);
            String formattedNumber = formatNumberWithCommas(number);
            System.out.println("So da dinh dang: " + formattedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Chuoi khong hop le. Vui long nhap lai so.");
        }

        System.out.println("\n=========Villain=========\n");
    }
    
    public static String formatNumberWithCommas(long number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(number);
    }
}