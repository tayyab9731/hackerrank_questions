
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursive.digit.sum;

/**
 *
 * @author vend-tayyab
 */
import java.math.*;
import java.util.*;

public class RecursiveDigitSum {

    static int superDigit(String n, int k) {

        BigInteger bi1 = new BigInteger(n); //or 1000000000000
        BigInteger bim = new BigInteger(k + "");
        // multiply bi1 with bi2 and assign result to bi3
        BigInteger bi2 = bi1.multiply(bim);

        StringBuilder str = new StringBuilder("" + bi2);
        return digitSum(str);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);
        System.out.println(result);

        scanner.close();
    }

    private static int digitSum(StringBuilder str) {

        int sum = 0;
        if (str.length() == 1) {
            return Integer.parseInt(str + "");
        }
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        str.delete(0, str.length());
        str.append(sum);
        return digitSum(str);
//To change body of generated methods, choose Tools | Templates.
    }
}
