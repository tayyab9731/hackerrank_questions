/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.very.big.sum;

/**
 *
 * @author vend-tayyab
 */
import java.io.*;
import java.util.*;

public class AVeryBigSum {

    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ar[i];
        }
        return sum;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scan.nextInt();
        long ar[] = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);

    }
}
