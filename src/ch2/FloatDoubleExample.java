package ch2;
/*
java는 실수 리터럴의 기본 타입을 double로 간주하여
float타입 변수에 실수 리터럴을 저장하기 위해서는 리터럴 뒤에 f 나 F를 붙여야 한다.

정수 리터럴에 10의 지수를 나타내는 E 또는 e를 포함하고 있으면 실수타입 변수에 저장해야한다.
*/

public class FloatDoubleExample {
    public static void main(String[] args) {
        //실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14;            //컴파일에러
        float var3 = 3.14f;

        //정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789f;

        System.out.println(var1);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        //e 사용하기
        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6f;
        double var9 = 2e-3;

        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);

    }
}
