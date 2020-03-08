package ch2;
/*
강제타입변환(Casting)
큰 크기의 타입을 작은 크기의 타입으로 쪼개어서 저장하는 것
*/

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
