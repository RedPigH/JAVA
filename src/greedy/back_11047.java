package greedy;

import java.util.Scanner;

public class back_11047 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), K = s.nextInt(), result = 0;
        int tmp = K;
        int coin[] = new int[N];

        for(int i = 0; i < N; i++){
            coin[i] = s.nextInt();
        }

        //보유한 가장 큰 동전 개수를 확인한다.
        for(int i = N - 1; i >= 0; i--){
            result += tmp/coin[i];
            tmp%=coin[i];
            if(tmp%coin[i] == 0) break;
        }

        System.out.println(result);
    }
}
