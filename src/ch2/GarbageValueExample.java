package ch2;

/*byte이 경우 -128(최소값)에서 시작해서 127(최대값)을 넘으면 다시 -128(최소값)부터 시작*/

public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;             // int type의 범위 : -2의 31승 ~ -2의 31승 -1
        for(int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
        }
    }
}
