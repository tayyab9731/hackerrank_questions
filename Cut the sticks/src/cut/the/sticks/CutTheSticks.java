/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cut.the.sticks;

/**
 *
 * @author vend-tayyab
 */
import java.util.*;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        try {
            for (int i = 0; i < n;) {
                System.out.println(arr.length - i);
                i++;
                while (arr[i] == min) {
                    i++;
                }
                min = arr[i];
            }
        } catch (Exception e) {
        }
    }

}
