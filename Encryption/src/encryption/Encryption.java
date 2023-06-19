/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encryption;

/**
 *
 * @author vend-tayyab
 */
import java.io.*;
import java.util.*;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        s = s.replaceAll("\\s+", "");
        double l = s.length();
        StringBuilder sb = new StringBuilder();
        int column = (int) Math.ceil(Math.sqrt(l));
        int temp = column;
        for (int i = 0; i < column; i++) {
            for (int j = i; j < l; j += temp) {
                sb.append(s.charAt(j));
            }
            sb.append(' ');
            temp = column;
        }
        return sb + "";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
