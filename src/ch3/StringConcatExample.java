package ch3;

/*
문자열과 숫자가 혼합된 + 연산식은 왼쪽에서 부터 오른쪽으로 연산이 진행된다
*/

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;      //JDK + 3 연산이 먼저 실행되어 JDK33.0
        String str4 = 3 + 3.0 + " JDK";     // 3 + 3.0 연산이 먼저 실행되어 6.0JDK
        System.out.println(str3);
        System.out.println(str4);
    }
}
