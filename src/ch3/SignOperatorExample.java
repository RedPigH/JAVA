package ch3;

/*
부호연산자 사용시 산출 타입은 int타입이 된다
short타입 값을 부호 연산하면 int 타입값으로 바뀐다.
*/

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println(result1);
        System.out.println(result2);

        short s = 100;

        //short result3 = -s;       //컴파일에러
        int result3 = -s;
        System.out.println(result3);
    }
}
