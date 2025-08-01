package PERTEMUAN4;

public class Larik {
    // Metode bubbleSort mengurutkan array menggunakan algoritma Bubble Sort
    public static int[] bubbleSort(int[] array) {
        // Mengambil panjang array
        int n = array.length;
        // Melakukan iterasi sebanyak n-1 kali
        for (int a = 0; a < n - 1; a++) {
            // Melakukan iterasi sebanyak n-a-1 kali untuk setiap iterasi luar
            for (int b = 0; b < n - a - 1; b++) {
                // Jika elemen saat ini lebih kecil dari elemen berikutnya
                if (array[b] < array[b + 1]) {
                    // Menukar elemen saat ini dengan elemen berikutnya
                    int elemen = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = elemen;
                }
            }
        }
        // Mengembalikan array yang telah diurutkan
        return array;
    }

    // Metode selectionSort mengurutkan array menggunakan algoritma Selection Sort
    public static int[] selectionSort(int[] array) {
        // Mengambil panjang array
        int n = array.length;
        // Melakukan iterasi sebanyak n-1 kali
        for (int i = 0; i < n - 1; i++) {
            // Menemukan indeks elemen maksimum dalam sisa array
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Jika elemen saat ini lebih besar dari elemen maksimum saat ini
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Menukar elemen maksimum dengan elemen saat ini
            int elemen = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = elemen;
        }
        // Mengembalikan array yang telah diurutkan
        return array;
    }
}

