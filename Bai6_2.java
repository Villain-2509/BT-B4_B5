package Buoi4;

import java.util.Scanner;

public class Bai6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        scanner.close();

        String normalizedString = normalizeString(input);
        System.out.println("Chuoi dau ra: " + normalizedString);

        System.out.println("\n=========Villain=========\n");
    }

    public static String normalizeString(String input) {
        // Loại bỏ khoảng trắng ở đầu và cuối chuỗi, và cắt bỏ khoảng trắng trong chuỗi
        String trimmedString = input.trim();
        
        // Chuyển đổi chuỗi thành mảng các từ
        String[] words = trimmedString.split("\\s+");

        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // Viết hoa chữ cái đầu tiên của từ
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(capitalizedWord).append(" ");
        }
        
        // Loại bỏ khoảng trắng thừa ở cuối và thêm dấu chấm kết thúc
        return result.toString().trim() + ".";
    }
}
