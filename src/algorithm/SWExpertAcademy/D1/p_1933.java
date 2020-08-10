package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class p_1933 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            for(int i = 1; i <= N; i++){
                if(N % i == 0) System.out.print(i + " ");
                else if(i == N) System.out.print(i);
            }
        }
    }
}
