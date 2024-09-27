import java.util.Scanner;

public class SiAkad14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim +")");
        System.out.println("Kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
    }
}