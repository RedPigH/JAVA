package ch3;

/*
비트반전연산자
정수타입(byte, short, int, long)의 피연산자에만 사용
피연산자를 2진수로 표현했을때 비트값인 0을 1로, 1은 0으로 변환
부호 비트인 최상위 비트를 포함하여 모든 비트가 반전되므로 부호가 반대인 새로운 값이 된다.
*/

public class BitReverseOperatorExample {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1 + 1;
        System.out.println(toBinaryString(v1));
        System.out.println(toBinaryString(v2));
        System.out.println(toBinaryString(v3));

        int v4 = -10;
        int v5 = ~v4;
        int v6 = ~v4 + 1;
        System.out.println(toBinaryString(v4));
        System.out.println(toBinaryString(v5));
        System.out.println(toBinaryString(v6));
    }

    // Integer.toBinaryString() 메소드는 앞의 비트가 모두 0이면 0이 생략되어 나타내므로
    // 32개의 비트를 모두 얻기 위하여 길이가 32이하면 앞에 0을 붙여서 return
    public static String toBinaryString(int value){
        String str = Integer.toBinaryString(value);
        while(str.length() < 32){
            str = "0" + str;
        }
        return str;
    }
}
