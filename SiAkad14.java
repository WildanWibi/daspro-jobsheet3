import java.util.Scanner;

public class SiAkad14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.println("Masukkan nama");
        nama = sc.nextLine();
        System.out.println("Masukkan nim");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan absen");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas:" + kelas + "Absen: " + kelas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
    }
}