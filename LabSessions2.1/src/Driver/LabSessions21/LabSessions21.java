package Driver.LabSessions21;

import java.util.Scanner;

import Service.function;
import Sorting.MergeSort;

public class LabSessions21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size, key;

        System.out.println("Enter the number of Denominations :"); // getting the size of the array
        size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the denominations value :"); // Getting the Denomination values
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the Key value : "); // getting the target value
        key = sc.nextInt();

        MergeSort MS = new MergeSort(); // Sorting using Merge Sort
        MS.msort(a, 0, a.length - 1);

        System.out.println("Sorted Array :");
        for (int i = 0; i < a.length; i++) { // printing out the sorted array for reference
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");

        function f = new function(); // finding the number of notes that can acheive the target
        f.count(a, key);

        sc.close();

    }

}
