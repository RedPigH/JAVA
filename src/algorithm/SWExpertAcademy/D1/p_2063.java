package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*중간값은 통계 집단의 수치를 크기 순으로 배열 했을 때 전체의 중앙에 위치하는 수치를 뜻한다.

입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라.

1. N은 항상 홀수로 주어진다.

2. N은 9이상 199 이하의 정수이다. (9 ≤ N ≤ 199)

*/
public class p_2063 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 1;

        for (int test_case = 1; test_case <= T; test_case++) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int N = sc.nextInt();
            for(int i = 0; i < N; i++){
                arrayList.add(sc.nextInt());
            }

            Collections.sort(arrayList);

            System.out.print(arrayList.get(N / 2));         //arrayList 첫 index는 0이므로 중간 index는 N / 2
        }
    }
}
