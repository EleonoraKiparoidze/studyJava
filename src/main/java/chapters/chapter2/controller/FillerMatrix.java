package chapters.chapter2.controller;

public class FillerMatrix {
    public FillerMatrix() {
    }

    public int[][] fillMatrix(int N, int k) {
        int[][] matrix = new int[N][N];
        int[] array = fillArray(k);
        for (int i = 0, a = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = array[a++];
            }
        }
        return matrix;
    }

    private int[] fillArray(int k) {
        int array[] = new int[k];
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 100 + 1);
            array[i] = number;
        }
        return array;
    }
}
