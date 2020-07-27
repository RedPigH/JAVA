package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

/*10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.*/

public class p_2068 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int max = 0;

            for(int i = 0; i < 10; i++){
                int tmp = sc.nextInt();
                if(max < tmp) max = tmp;
            }

            System.out.println("#"+test_case+" "+max);
        }
    }

}
