/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beautifulday;

/**
 *
 * @author vend-tayyab
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDay {

    // Complete the beautifulDays function below.
   static int beautifulDays(int i, int j, int k) {
      int count=0,temp,reverse=0;
        for (int s=i;s<=j;s++)
       {  
 temp=getReverseInt(s);
          
if((s-temp)%k==0)
count++;
       }
        System.out.println(count);
return count;
    }
public static int getReverseInt(int value) {
    int resultNumber = 0;
    for (int i = value; i !=0; i /= 10) {
        resultNumber = resultNumber * 10 + i % 10;
    }
    return resultNumber;        
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

