/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra.pkglong.factorials;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author vend-tayyab
 */

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
  BigInteger fact = BigInteger.valueOf(1);
    for (int i = n; i>0; i--)
        fact = fact.multiply(BigInteger.valueOf(i));
    System.out.println(fact);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
