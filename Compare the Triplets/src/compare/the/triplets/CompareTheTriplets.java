/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compare.the.triplets;

/**
 *
 * @author vend-tayyab
 */
import java.util.*;

public class CompareTheTriplets {

    static int[] solve(int array[], int array1[]) {
        int array2[] = new int[2];
        for (int i = 0; i < 3; i++) {
            if (array[i] > array1[i]) {
                array2[0] += 1;
            } else if (array[i] < array1[i]) {
                array2[1] += 1;
            } else {
                array2[0] += 0;
                array2[1] += 0;
            }
        }
        return array2;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[3];
        int array1[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            array1[i] = scan.nextInt();
        }
        int[] points = solve(array, array1);
        for (int i = 0; i < 2; i++) {

            System.out.print(points[i] + " ");
        }
    }
}
