package ch3;

/*
문자 A는 65라는 유니코드를 가지므로 'A' + 1은 66이 되어 c1에는 66에 해당하는 문자 B가 저장된다
하지만 변수 c2에 1을 더하게 되면 c2는 int타입으로 변환되어 1과 연산이 되기 때문에 산출 타입은 int타입이 된다
따라서 char타입 변수 c3에 대입이 불가하여 컴파일 에러가 발생
해결방법 : c2 + 1 연산을 캐스팅 -> (char) (c2 + 1)
*/

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1;     //컴파일에러
        System.out.println(c1);
        System.out.println(c2);
    }
}
