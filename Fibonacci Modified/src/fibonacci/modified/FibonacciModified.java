/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci.modified;

/**
 *
 * @author vend-tayyab
 */
import java.io.*;
import java.math.*;
import java.util.*;

public class FibonacciModified {

    // Complete the fibonacciModified function below.
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        BigInteger t1 = new BigInteger(scn.nextInt() + "");
        BigInteger t2 = new BigInteger(scn.nextInt() + "");
        int n = scn.nextInt();

        BigInteger temp = new BigInteger("0");
        for (int i = 3; i <= n; i++) {
            temp = t2;
            t2 = t2.multiply(t2);
            t2 = t2.add(t1);
            t1 = temp;
        }
        System.out.println(t2);
    }
}
