package ch3;

/*
부동소수점 타입(float, double)은 0.1을 정확히 표현할 수 없어 근사치로 처리
정확한 계산이 필요하다면 정수 연산으로 변경하여 계산 -> AccuracyExample2.java
*/

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;

        System.out.println("사과 한개에서");
        System.out.println("0.7 조각을 빼면");
        System.out.println(result + "조각이 남는다");
    }
}
