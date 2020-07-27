package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

/*2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.*/
public class p_2070 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String result = "=";

            int a = sc.nextInt(), b = sc.nextInt();

            if(a > b) result = ">";
            else if(a < b) result = "<";

            System.out.println("#"+test_case+" "+result);
        }
    }
}
