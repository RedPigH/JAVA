package ch3;

/*
프로그램 코드에서 / 와 % 연산의 결과가 Infinity or NaN인지 확인 하려면
Double.isInfinite(), Double.isNaN() 메소드를 사용하여 확인하면 된다
*/

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z1 = x % y;
        double z2 = x / y;

        System.out.println(Double.isInfinite(z1));
        System.out.println(Double.isNaN(z1));

        System.out.println(z1 + 2);     //NaN

        System.out.println(Double.isInfinite(z2));
        System.out.println(Double.isNaN(z2));

        System.out.println(z2 + 2);     //Infinity

    }
}
