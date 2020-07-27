package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

/*10개의 수를 입력 받아, 평균값을 출력하는 프로그램을 작성하라.

        (소수점 첫째 자리에서 반올림한 정수를 출력한다.)*/
public class p_2071 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            double result = 0;

            for (int i = 0; i < 10; i++) {
                result += sc.nextInt();
            }
            System.out.println("#"+test_case+" "+Math.round(result / 10));
        }
    }
}
