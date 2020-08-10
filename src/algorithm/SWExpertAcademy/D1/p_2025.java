package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class p_2025 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int result = 0;

            for(int i = 1; i <= N; i++){
                result += i;
            }

            System.out.println(result);
        }
    }
}
