package chapters.chapter2.run;

class PrinterMatrix {
    void printMatrix(int[][] matrix){
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
    }
}
