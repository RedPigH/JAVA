package ch3;
/*
쉬프트 연산자
a << b : 정수 a의 비트를 왼쪽으로 b만큼 이동(빈자리는 0으로 채움)
a >> b : 정수 a의 비트를 오른쪽으로 b만큼 이동(빈자리는 정수 a의 최상위 비트 부호로 채움)
a >>> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 0으로 채움)
*/

public class BitShiftExample {
    public static void main(String[] args) {
        System.out.println("1 << 3 =" + (1 << 3));
        System.out.println("-8 >> 3 =" + (-8 >> 3));
        System.out.println("-8 >>> 3 =" + (-8 >>> 3));
    }
}
