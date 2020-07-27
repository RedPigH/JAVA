package greedy;

import java.util.Scanner;

public class back_1931 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] con = new int[N][2];

        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < 2; j++){
                con[i][j] = s.nextInt();
            }
        }
    }
}
