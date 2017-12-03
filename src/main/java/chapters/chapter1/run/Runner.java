package chapters.chapter1.run;

import chapters.chapter1.controller.SortNumbers;

import java.util.Scanner;

/**
 * Created by Eleonora on 03.12.2017.
 */
public class Runner {
    public void chapterOneRunner(){
        System.out.println("Enter count of numbers");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Please enter number");
            array[i] = scanner.nextInt();
        }
        SortNumbers sortNumbers = new SortNumbers();
        System.out.print("Ascending Order-> ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(sortNumbers.sortAscendingOrder(array)[i]+", ");
        }
        System.out.print("Descending Order-> ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(sortNumbers.sortDescendingOrder(array)[i]+", ");
        }

    }
}
