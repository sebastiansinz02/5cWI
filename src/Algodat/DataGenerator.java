package Algodat;

public class DataGenerator {
    public static void main(String[] args) {
        int[] arr1 = generateDataArray(4);
        int[] arr2 = generateDataArray(4, -5, 50);
        printArray(arr1);
        printArray(arr2);
    }

    public static int[] generateDataArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.round((float) (Math.random() * 999999));

        }
        return array;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.round((float) (Math.random() * (max - min) + min));

        }
        return array;
    }


    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");

        }
        System.out.println();
        System.out.println();
    }
}



