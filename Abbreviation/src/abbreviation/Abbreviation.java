/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abbreviation;

/**
 *
 * @author vend-tayyab
 */


import java.util.Scanner;

public class Abbreviation {
    public static boolean isUpcase(char c) {
        return (c >= 'A') && (c <= 'Z');
    }

    public static char upcase(char c) {
        if (isUpcase(c)) return c;
        return (char)(c - 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();

            boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
            for (int i = 0; i <= s1.length(); i++) {
                for (int j = 0; j <= s2.length(); j++) {
                    dp[i][j] = false;
                }
            }
            dp[0][0] = true;

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j <= s2.length(); j++) {
                    if (dp[i][j]) {
                        if (j < s2.length() && (upcase(s1.charAt(i)) == s2.charAt(j))) {
                            dp[i + 1][j + 1] = true;
                        }
                        if (!isUpcase(s1.charAt(i))) {
                            dp[i + 1][j] = true;
                        }
                    }
                }
            }

            if (dp[s1.length()][s2.length()]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
