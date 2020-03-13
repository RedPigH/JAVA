package ch3;
/*
비트 논리연산자
AND(논리곱) : & -> 두 비트 모두 1일 경우에만 연산 결과 1
OR(논리합) : | -> 두 비트 중 하나만 1이면 연산 결과 1
XOR(배타적 논리합) : ^ -> 두 비트가 서로 다를 경우 연산 결과 1
NOT(논리 부정) : ~ -> 보수(0은 1로 1은 0으로)
*/

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
    }
}
