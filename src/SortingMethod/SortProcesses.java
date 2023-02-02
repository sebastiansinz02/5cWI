package SortingMethod;

public class SortProcesses {
    public static void main(String[] args) {
        int[] intArray = {8, 41, 2, 72, 3, 5, 5};
        int[] selectionArray = selectionSort(intArray);
        int[] bubbleArray = bubbleSort(intArray);
        int[] insertionArray = insertionSort(intArray);
        printArray(selectionArray);
        printArray(bubbleArray);
        printArray(insertionArray);
    }

    public static int[] selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }

        return data;
    }

    public static int[] bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
            }
        }
        return data;
    }

    public static int[] insertionSort(int[] data) {
        int i, key, j;
        for (i = 1; i < data.length; i++) {
            key = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }

        return data;
    }


    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");

        }
        System.out.println();
        System.out.println();
    }

}



