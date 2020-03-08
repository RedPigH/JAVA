package ch2;
/*
Casting 시 정수 -> 실수 타입 변환 시에도 손실을 피해야 한다
int 값을 손실없이 float 값으로 변환할 수 있으려면 가수 23비트로 표현 가능한 값이어야 한다

아래 예제와 같이 123456780은 23비트로 표현할 수 없기에 캐스팅시 근사값으로 변환되어 저장되어
기존의 int 값과 차이가 발생하게 된다
*/

public class FromIntToFloat {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result);
    }
}
