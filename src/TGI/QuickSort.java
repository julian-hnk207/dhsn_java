package TGI;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] testGroessen = {500, 1000, 2500, 5000, 10000, 20000, 30000, 50000};

        // Warm-up
        int[] warmup = generiereZufallsArray(1000);
        quickSort(warmup, 0, warmup.length - 1);

        System.out.println("n;QuickSort_ms");

        for (int n : testGroessen) {
            int[] arr = generiereZufallsArray(n);

            long start = System.nanoTime();
            quickSort(arr, 0, arr.length - 1);
            long dauerNs = System.nanoTime() - start;

            double dauerMs = dauerNs / 1_000_000.0;
            System.out.printf("%d;%.4f%n", n, dauerMs);
        }
    }

    public static void quickSort(int[] arr, int links, int rechts) {
        if (links < rechts) {
            int pivotIndex = teile(arr, links, rechts);
            quickSort(arr, links, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, rechts);
        }
    }

    private static int teile(int[] arr, int links, int rechts) {
        int pivot = arr[rechts];
        int i = links - 1;

        for (int j = links; j < rechts; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[rechts];
        arr[rechts] = temp;

        return i + 1;
    }

    private static int[] generiereZufallsArray(int n) {
        Random rand = new Random(42);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100_000);
        }
        return arr;
    }
}