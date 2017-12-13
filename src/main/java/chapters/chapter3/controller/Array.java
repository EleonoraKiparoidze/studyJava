package chapters.chapter3.controller;

public class Array {

    public static void bubbleSort(Comparable[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) >= 1) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void shakerSort(Comparable[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            for (int i = left; i < right; i++) {
                if (array[i].compareTo(array[i + 1]) >= 1)
                    swap(array, i, i + 1);
            }
            right--;

            for (int i = right; i > left; i--) {
                if (array[i - 1].compareTo(array[i]) >= 1) {
                    swap(array, i - 1, i);
                }
                left++;
            }
        }
    }

    private static void swap(Comparable[] array, int i, int j) {
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void selectionSort(Comparable[] array) {
        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j].compareTo(array[least]) <= -1) {
                    least = j;
                }
            }
            swap(array, min, least);
        }
    }

    public static void insertionSort(Comparable[] array) {
        Comparable temp;
        int j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) >= 1) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp.compareTo(array[j - 1]) <= -1) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }

    public static void shellSort(Comparable[] array) {
        int increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                Comparable temp = array[i];
                while (j >= increment && array[j - increment].compareTo(temp) >= 1) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }



}
