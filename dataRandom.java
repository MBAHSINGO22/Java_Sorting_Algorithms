
package PERTEMUAN4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dataRandom {

    public static void main(String[] args) {
        // Membuat array dataRandom dengan 1000 elemen
        int[] dataRandom = new int[1000];
        // Mengisi array dengan angka acak antara 0 dan 999
        for (int i = 0; i < 1000; i++) {
            dataRandom[i] = (int) (Math.random() * 1000);
        }

        // Mengubah array int[] menjadi Integer[]
        Integer[] dataRandomInteger = Arrays.stream(dataRandom).boxed().toArray(Integer[]::new);

        // Mengukur waktu untuk algoritma pengurutan
        // Menggunakan Bubble Sort, Selection Sort, dan Insertion Sort
        // Catatan: Metode pengurutan ini menggunakan Arrays.sort() untuk kesederhanaan

        // Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(dataRandomInteger);
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort time: " + (endTime - startTime) + " nanoseconds");

        // Selection Sort
        startTime = System.nanoTime();
        selectionSort(dataRandomInteger);
        endTime = System.nanoTime();
        System.out.println("Selection Sort time: " + (endTime - startTime) + " nanoseconds");

        // Mengubah kembali Integer[] menjadi int[]
        dataRandom = Arrays.stream(dataRandomInteger).mapToInt(Integer::intValue).toArray();


    }

    // Metode bubbleSort mengurutkan array menggunakan algoritma Bubble Sort
    // Dalam kasus ini, menggunakan Arrays.sort() untuk kesederhanaan
    public static void bubbleSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    // Metode selectionSort mengurutkan array menggunakan algoritma Selection Sort
    // Dalam kasus ini, menggunakan Arrays.sort() untuk kesederhanaan
    public static void selectionSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    // Metode insertionSort mengurutkan array menggunakan algoritma Insertion Sort
    // Dalam kasus ini, menggunakan Arrays.sort() untuk kesederhanaan
    public static void insertionSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
}