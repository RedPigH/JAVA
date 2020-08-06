package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p_2050 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;
        int result = 0;

        for (int test_case = 1; test_case <= T; test_case++) {
            String s = sc.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if(i != s.length() -1)
                    System.out.print((int)s.charAt(i) - 64 + " ");
                else
                    System.out.print((int)s.charAt(i) - 64);
            }
        }
    }
}
