package TGI;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] testGroessen = {500, 1000, 2500, 5000, 10000, 20000, 30000, 50000};

        // Warm-up
        bubbleSort(generiereZufallsArray(1000));

        System.out.println("n;BubbleSort_ms");

        for (int n : testGroessen) {
            int[] arr = generiereZufallsArray(n);

            long start = System.nanoTime();
            bubbleSort(arr);
            long dauerNs = System.nanoTime() - start;

            double dauerMs = dauerNs / 1_000_000.0;
            System.out.printf("%d;%.4f%n", n, dauerMs);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean getauscht;
        for (int i = 0; i < n - 1; i++) {
            getauscht = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    getauscht = true;
                }
            }
            if (!getauscht) {
                break;
            }
        }
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