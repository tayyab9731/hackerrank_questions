/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biggerisgreater;

import java.util.Scanner;

/**
 *
 * @author vend-tayyab
 */
public class BiggerIsGreater {

    static String biggerIsGreater(StringBuilder w) {
        char temp;
        int i;
        for (i = w.length() - 2; i >= 0; i--) {
            if (w.charAt(i) < w.charAt(i + 1)) {
                break;
            }
        }
        if (i < 0) {
            return "no answer";
        }
        for (int j = w.length() - 1; j > i; j--) {
            if (w.charAt(j) > w.charAt(i)) {
                temp = w.charAt(j);
                w.setCharAt(j, w.charAt(i));
                w.setCharAt(i, temp);
                break;
            }
        }
        w.replace(i + 1, w.length(), reverse(w.substring(i + 1, w.length())));

        return w.toString();

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            StringBuilder w = new StringBuilder(scanner.nextLine());

            System.out.println(biggerIsGreater(w));
        }
    }

    private static String reverse(String substring) {
        //To change body of generated methods, choose Tools | Templates.
        StringBuilder rev = new StringBuilder(substring);
        return rev.reverse() + "";
    }
}
