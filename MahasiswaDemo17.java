import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();

        // Memasukkan data mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();

            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Menghindari bug newline setelah nextDouble()

            list.tambah(new Mahasiswa17(nim, nama, kelas, ipk));
            System.out.println("-------------------------------");
        }

        // Proses sorting
        list.insertionSort();

        // Menampilkan hasil setelah sorting
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.tampil();

        // Menutup Scanner
        scanner.close();
    }
}