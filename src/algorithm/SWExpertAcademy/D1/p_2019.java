package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class p_2019 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            for(int i = 0; i <=N; i++){
                System.out.print((int)Math.pow(2,i) + " ");
            }
        }
    }
}
