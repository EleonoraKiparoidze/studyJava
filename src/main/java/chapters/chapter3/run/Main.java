package chapters.chapter3.run;

import chapters.chapter3.controller.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer [] integers = {1,5,1,6,3,8,9};
        Array.bubbleSort(integers);
        System.out.println(Arrays.toString(integers));

        String [] strings = {"c","a","d","b","c","a","d","b"};
        Array.bubbleSort(strings);
        System.out.println(Arrays.toString(strings));

        Integer [] integers2 = {1,5,1,6,3,8,9};
        Array.shakerSort(integers2);
        System.out.println(Arrays.toString(integers2));

        String [] strings2 = {"k","a","l","b","c","a","d","b"};
        Array.selectionSort(strings2);
        System.out.println(Arrays.toString(strings2));

        String [] strings3 = {"k","k","l","b","c","a","d","b"};
        Array.insertionSort(strings3);
        System.out.println(Arrays.toString(strings3));

        String [] stringsShell = {"i","k","l","b","c","h","h","a"};
        Array.shellSort(stringsShell);
        System.out.println(Arrays.toString(stringsShell));
    }
}
