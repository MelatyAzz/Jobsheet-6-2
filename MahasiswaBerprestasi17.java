public class MahasiswaBerprestasi17 {
    Mahasiswa17[] listMhs = new Mahasiswa17[5];
    int idx;
}
    void tambah(Mahasiswa17 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa17 m : listMhs) {
                m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    // Metode Insertion Sort (Ascending berdasarkan IPK)
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa17 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
