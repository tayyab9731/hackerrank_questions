/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utopian.tree;

/**
 *
 * @author vend-tayyab
 */


import java.util.*;

public class UtopianTree {
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        for(int i = 0; i < testCases; i++)
        {
            int cycles = input.nextInt();
            
            //Calculates according the an equation defined by the arithmetico-geometric sequence
            if(cycles % 2 == 0)
            {
                System.out.println((int) (Math.pow(2, cycles/2)*2) -1);
            }
            else
            {
                System.out.println((int) ((Math.pow(2, (cycles-1)/2)*2) -1)*2);
            }
        }
    }}
