import java.util.Scanner;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    Mahasiswa17() {}
    
    Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println("-------------------------------");
    }
}

