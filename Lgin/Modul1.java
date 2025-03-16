package Lgin;
import java.util.Scanner;

public class Modul1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            String tigaDigitNIM = "091";
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = scanner.nextLine();
                    if (username.equals("Admin" + tigaDigitNIM) && password.equals("Password" + tigaDigitNIM)) {
                        System.out.println("Login Admin berhasil!");
                    } else {
                        System.out.println("Login gagal! Username atau password salah.");
                    }   break;
                case 2:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    String namaValid = "Muhammad Rafi Aditya Maulana";
                    String nimValid = "202410370110084";
                    if (nama.equals(namaValid) && nim.equals(nimValid)) {
                        System.out.println("Login Mahasiswa berhasil!");
                        System.out.println("Nama: " + nama);
                        System.out.println("NIM: " + nim);
                    } else {
                        System.out.println("Login gagal! Nama atau NIM salah.");
                    }   break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}