import java.util.Scanner;
import java.time.LocalDate;

class Modul1 {
    public static void main(String[] args) {
        String nama;
        char jenisKelamin;
        int tahunLahir;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan tahun lahir: ");
            tahunLahir = scanner.nextInt();
        }

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelaminStr;
        switch (jenisKelamin) {
            case 'L':
            case 'l':
                jenisKelaminStr = "Laki-laki";
                break;
            case 'P':
            case 'p':
                jenisKelaminStr = "Perempuan";
                break;
            default:
                jenisKelaminStr = "Tidak valid";
                break;
        }

        System.out.println("\nData Diri:");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur        : " + umur + " tahun");
   }
}