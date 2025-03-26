import java.util.Scanner;

public class MainDosen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen dataDosen = new DataDosen();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia, Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia, Selection Sort)");
            System.out.println("5. Sorting DSC (Usia, Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    if (dataDosen.idx < dataDosen.dataDosen.length) {
                        System.out.print("Kode Dosen: ");
                        String kode = scanner.nextLine();
                        System.out.print("Nama Dosen: ");
                        String nama = scanner.nextLine();
                        System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                        boolean jk = scanner.nextBoolean();
                        System.out.print("Usia: ");
                        int usia = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan buffer input

                        Dosen dsn = new Dosen(kode, nama, jk, usia);
                        dataDosen.tambah(dsn);
                        System.out.println("Data dosen berhasil ditambahkan!");
                    } else {
                        System.out.println("Data dosen sudah penuh!");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Data Dosen:");
                    dataDosen.tampil();
                    break;

                case 3:
                    dataDosen.SortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    dataDosen.tampil();
                    break;

                case 4:
                    dataDosen.sortingDSC();
                    System.out.println("Data setelah sorting DSC (Selection Sort):");
                    dataDosen.tampil();
                    break;

                case 5:
                    dataDosen.insertionSort();
                    System.out.println("Data setelah sorting DSC (Insertion Sort):");
                    dataDosen.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
