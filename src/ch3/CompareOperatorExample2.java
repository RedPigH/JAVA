package ch3;
/*
이진 포맷의 가수를 사용하는 모든 부동소수점 타입은 0.1을 정확히 표현할 수 없어
0.1f는 0.1의 근사값으로 표현되어 0.100000000149.... 와 같이 0.1보다 큰값이 되어버린다
부동소수점 타입의 피연산자를 비교연산시에는 정수로 변환하여 비교하던지 같은 float이나 double로 캐스팅하여 비교하여야함
*/

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);
        System.out.println((float)v4 == v5);
        System.out.println((int)(v4*10) == (int)(v5*10));
    }
}
