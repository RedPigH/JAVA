package ch3;
/*
논리부정연산자
조건문과 제어문에서 사용되어 조건식의 값을 부정하도록 하여 실행 흐름을 제어할 때 주로 사용
토글 기능을 구현할 때도 사용
*/

public class DenyLogicOperatorExample {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

    }
}
