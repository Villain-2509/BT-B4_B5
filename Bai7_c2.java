package Buoi4;

import java.io.*;
import java.util.*;

class Employee {
    private String ID;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String gender;
    private int birthYear;
    private String hometown;

    public Employee(String ID, String fullName, String phoneNumber, String email, String gender, int birthYear, String hometown) {
        this.ID = ID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.birthYear = birthYear;
        this.hometown = hometown;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return ID + "-" + fullName + "-" + birthYear;
    }
}

public class Bai7_c2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("");
            System.out.println("----------------------QL Nhân Vien--------------------------------");
            System.out.println("1- Xem danh sach nhan vien");
            System.out.println("2- Them moi 1 nhan vien");
            System.out.println("3- Xoa 1 nhân vien truyen vao ma nhan vien");
            System.out.println("4- Chinh sua 1 nhan vien truyen vao ma nhan vien");
            System.out.println("5- Tim kiem nhan vien dua vao ma nhan vien/email/sdt");
            System.out.println("6- Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Xem danh sách nhân viên
                    if (employees.isEmpty()) {
                        System.out.println("\nDanh sach nhan vien trong.");
                    } else {
                        System.out.println("\nDanh sach nhan vien:");
                        for (Employee employee : employees) {
                            System.out.println(employee);
                        }
                    }
                    break;
                case 2:
                    // Thêm mới 1 nhân viên
                    System.out.println("\nNhap thong tin nhan vien can them vao danh sach: ");
                    System.out.print("Nhap ID(ma nv): ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap Ho va ten: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Nhap sdt: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Nhap email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhap gioi tinh: ");
                    String gender = scanner.nextLine();
                    System.out.print("Nhap nam sinh: ");
                    int birthYear = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Nhap que quan: ");
                    String hometown = scanner.nextLine();
                    employees.add(new Employee(id, fullName, phoneNumber, email, gender, birthYear, hometown));
                    System.out.println("\nNhan vien da duoc them moi.");
                    break;
                case 3:
                    // Xóa 1 nhân viên
                    System.out.print("\nNhap ma nhan vien de xoa thong tin: ");
                    String deleteID = scanner.nextLine();
                    boolean removed = false;
                    Iterator<Employee> iterator = employees.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().getID().equals(deleteID)) {
                            iterator.remove();
                            removed = true;
                            System.out.println("\nThong tin cua nhan vien da duoc xoa.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("\nKhong tim thay nhan vien co ma " + deleteID);
                    }
                    break;
                case 4:
                    // Chỉnh sửa 1 nhân viên
                    System.out.print("\nNhap ma nhan vien de chinh sua: ");
                    String editID = scanner.nextLine();
                    boolean edited = false;
                    for (Employee employee : employees) {
                        if (employee.getID().equals(editID)) {
                            System.out.println("Nhap thong tin moi cua nhan vien: ");
                            System.out.print("Nhap ho ten moi: ");
                            employee.setFullName(scanner.nextLine());

                            System.out.print("Nhap sdt moi: ");
                            employee.setPhoneNumber(scanner.nextLine());

                            System.out.print("Nhap email moi: ");
                            employee.setEmail(scanner.nextLine());

                            System.out.print("Nhap gioi tinh moi: ");
                            employee.setGender(scanner.nextLine());

                            System.out.print("Nhap nam sinh moi: ");
                            employee.setBirthYear(scanner.nextInt());
                            scanner.nextLine();  // Clear newline

                            System.out.print("Nhap que quan moi: ");
                            employee.setHometown(scanner.nextLine());

                            System.out.println("\nNhan vien da duoc chinh sua.");
                            edited = true;
                            break;
                        }
                    }
                    if (!edited) {
                        System.out.println("\nKhong tim thay nhan vien co ma " + editID);
                    }
                    break;
                case 5:
                    // Tìm kiếm nhân viên
                    System.out.print("\nNhap ma nhan vien/email/sdt de tim kiem: ");
                    String searchInput = scanner.nextLine();
                    boolean found = false;
                    for (Employee employee : employees) {
                        if (employee.getID().equals(searchInput) || employee.getEmail().equals(searchInput) || employee.getPhoneNumber().equals(searchInput)) {
                            System.out.println("Thong tin nhan vien:");
                            System.out.println("ID(ma nv): " + employee.getID());
                            System.out.println("Ho va ten: " + employee.getFullName());
                            System.out.println("Sdt: " + employee.getPhoneNumber());
                            System.out.println("Email: " + employee.getEmail());
                            System.out.println("Gioi tinh: " + employee.getGender());
                            System.out.println("Nam sinh: " + employee.getBirthYear());
                            System.out.println("Que quan: " + employee.getHometown());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("\nKhong tim thay nhan vien co ma/email/sdt " + searchInput);
                    }
                    break;
                case 6:
                    // Thoát
                    System.out.println("\nChuong trinh ket thuc.");
                    System.out.println("\n=========Villain=========\n");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice != 6);
        
        // Lưu dữ liệu vào file
        try (PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))) {
            for (Employee employee : employees) {
                writer.println(employee.getID() + " _ " + employee.getFullName() + " _ " + employee.getPhoneNumber() + " _ " +
                        employee.getEmail() + " _ " + employee.getGender() + " _ " + employee.getBirthYear() + " _ " + employee.getHometown());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
