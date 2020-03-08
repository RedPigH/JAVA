package ch2;

/*
double의 경우 가수가 52비트이므로 32비트인 int타입의 경우 어떠한 값이라도
안전하게 데이터 손실 없이 캐스팅이 가능하다
*/

public class FromIntToDouble {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result);
    }
}
