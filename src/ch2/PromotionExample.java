package ch2;
/*
byte 크기별 타입 순서
byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

자동타입변환은 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 자동적으로 발생
자동 타입 변환 시 변환 이전의 값과 변환 이후의 값은 동일
정수타입이 실수타입으로 변환하는 것은 무조건 자동 타입 변환이 됨(.0이 붙은 실수값이 된다)
*/

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;           //int <- byte
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;               //int <- char
        System.out.println("가의 유니코드 = " + intValue);

        intValue = 500;
        long longValue = intValue;          //long <- int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;      //double <- int
        System.out.println(doubleValue);
    }
}
