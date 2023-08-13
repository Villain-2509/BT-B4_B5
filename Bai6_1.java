package Buoi4;

import java.util.Scanner;

public class Bai6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhhap ho ten: ");
        String fullName = scanner.nextLine();
        
        String[] nameParts = fullName.split("\\s+");
        
        if (nameParts.length >= 3) {
            String ho = nameParts[0];
            String dem = "";
            for (int i = 1; i < nameParts.length - 1; i++) {
                dem += nameParts[i] + " ";
            }
            String ten = nameParts[nameParts.length - 1];
            
            System.out.println("Ho: " + ho + "\nDem: " + dem + "\nTen: " + ten);
        } 
        else if (nameParts.length == 2) {
            String ho = nameParts[0];
            String dem = "";
            String ten = nameParts[1];
            
            System.out.println("Ho: " + ho + "\nDem: " + dem + "\nTen: " + ten);
        } 
        else if (nameParts.length == 1) {
            String ho = "";
            String dem = "";
            String ten = nameParts[0];
            
            System.out.println("Ho: " + ho + "\nDem: " + dem + "\nTen: " + ten);
        } 
        else {
            System.out.println("Chuoi ho ten khong hop le.");
        }
        
        scanner.close();

        System.out.println("\n=========Villain=========\n");System.out.println("\n=========Villain=========\n");
    }
}
