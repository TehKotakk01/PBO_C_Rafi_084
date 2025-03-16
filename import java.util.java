import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Masukkan nama = ");
        String nama = Scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char JenisKelamin = Scanner.next().CharAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = Scanner.nextInt();

        Scanner.close();

        int tahunSekarang = LocalDate.now().getYear();

        int umur = tahunSekarang - tahunLahir;
        
        String JenisKelaminstr;
        if (JenisKelamin == 'L' || JenisKelamin == 'l') {
            JenisKelaminstr = "Laki-laki";
        } else if (JenisKelamin == 'P' || JenisKelamin == 'p') {
            JenisKelaminstr = "Perempuan";
        } else {
            JenisKelaminstr = "Tidak Diketahui";
        }

        System.out.println("\nData Diri:");
        System.out.println("nama          : " + nama);
        System.out.println("Jenis Kelamin : " + JenisKelaminstr);
        System.out.println("Umur          : " + umur + " tahun");
        }
}