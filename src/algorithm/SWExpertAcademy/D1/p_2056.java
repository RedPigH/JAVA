package algorithm.SWExpertAcademy.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class p_2056 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("C:/Users/Hong/Desktop/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int test_case = 1; test_case <= T; test_case++) {
            int cal = sc.nextInt();

            int year = cal / 10000;
            int month = cal % 10000 / 100;
            int day = cal % 100;

            if(month == 0 || month > 12){
                System.out.println("#" + test_case + " -1");
                continue;
            }

            if(day > days[month -1]){
                System.out.println("#" + test_case + " -1");
                continue;
            }
            System.out.printf("#%d %04d/%02d/%02d\n",test_case,year,month,day);
        }
    }
}
