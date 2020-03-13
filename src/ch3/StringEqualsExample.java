package ch3;
/*
Java는 문자열 리터럴이 동일하다면 동일한 객체를 참조한다
그러나 객체 생성 연산자인 new 로 생성한새로은 객체는 기존 생성된 객체와 다른 객체를 참조한다
객체에 상관없이 문자열만을 비교하려면 equals() 메소드를 이용
*/

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍승표";
        String strVar2 = "홍승표";
        String strVar3 = new String("홍승표");

        System.out.println(strVar1 == strVar2);         //같은객체
        System.out.println(strVar1 == strVar3);         //다른객체
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar2.equals(strVar3));
    }
}
