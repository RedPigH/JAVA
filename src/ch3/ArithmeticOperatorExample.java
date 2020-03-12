package ch3;

/*
산술연산
나누기시 실수값을 얻고 싶다면 피연산자를 double 또는 float형으로 캐스팅하여 산술연산 실행
*/

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println(result1);

        int result2 = v1 - v2;
        System.out.println(result2);

        int result3 = v1 * v2;
        System.out.println(result3);

        int result4 = v1 / v2;
        System.out.println(result4);

        int result5 = v1 % v2;
        System.out.println(result5);

        double result6 = (double) v1 / v2;
        System.out.println(result6);
    }
}
