package chapters.chapter2.run;

import chapters.chapter2.controller.FillerMatrix;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int k,N;
        while(true) {
            System.out.println("Enter count of numbers");
            Scanner scanner = new Scanner(System.in);
            k = scanner.nextInt();
            System.out.println("Enter matrix size");
            N = scanner.nextInt();
            if (k < N * N) {
                System.out.println("Size of Matrix bigger then count of numbers");
                System.exit(1);
            }
            FillerMatrix fillerMatrix = new FillerMatrix();
            PrinterMatrix printerMatrix = new PrinterMatrix();
            printerMatrix.printMatrix(fillerMatrix.fillMatrix(N,k));
        }
    }
}
