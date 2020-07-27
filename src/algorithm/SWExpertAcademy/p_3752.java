package algorithm.SWExpertAcademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class p_3752 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T,N;
        T = s.nextInt();

        for(int i = 0; i < T; i++){
            ArrayList array = new ArrayList<>();
            N = s.nextInt();
            for(int j = 0; j < N; j++){
                array.add(s.nextInt());
            }
            solve(array);
        }
    }

    private static void solve(ArrayList array) {
        HashSet set = new HashSet();

        for(int i = 0; i < array.size(); i++){

        }
    }
}
