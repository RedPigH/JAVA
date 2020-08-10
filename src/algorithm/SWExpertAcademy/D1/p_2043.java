package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class p_2043 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;

        for (int test_case = 1; test_case <= T; test_case++) {
            int C = sc.nextInt();
            int S = sc.nextInt();
            int result;

            if(C<S) result = S - C + 1;
            else result = C - S + 1;

            System.out.print(result);
        }
    }
}
