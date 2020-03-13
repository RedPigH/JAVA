package ch3;
/*
비교연산 시 피연산자가 char 타입이면 유니코드값으로 비교연산을 수행
*/

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println(result4);
    }
}
