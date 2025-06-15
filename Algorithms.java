package data.visualizer;
import java.util.Arrays;


import javax.swing.*;

public class Algorithms {

    public static void bubbleSort(LinkedList list, ChartPanel chart) {
        int[] array = list.toArray();
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Update Visualization
                    chart.updateData(array);
                    try {
                        Thread.sleep(500); // Delay for visualization
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

    // Linear Search Example (Placeholder)
    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) return i;
        }
        return -1;
    }
}
