package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class p_2058 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;
        int result = 0;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            while (N != 0) {
                result += N % 10;
                N = N / 10;
            }
        }

        System.out.print(result);
    }
}
