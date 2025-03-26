public class Sorting17 {
    int[] data;
    int jumData;

    Sorting17(int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void insertionSort() {
        for (int i = 1; i < jumData; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int c[] = {40, 10, 4, 9, 3};

        Sorting17 dataurut3 = new Sorting17(c, c.length);

        System.out.println("Data awal 3:");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataurut3.tampil();
    }
}
