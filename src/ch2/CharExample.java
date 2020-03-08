package ch2;

/*변수의 타입이 char이면 유니코드에 해당하는 문자를 출력
char 타입 변수는 단하나의 문자만 저장
문자열을 저장 하고 싶다면 String 타입 이용
char 타입 변수의 '' 빈 문자를 대입하면 컴파일 에러 발생
공백 하나를 포함해서 초기화해아함 ex) char c1 = ' ';
*/

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';          //문자 직접 저장
        char c2 = 65;           //10진수로 저장
        char c3 = '\u0041';     //16진수로 저장

        char c4 = '가';         //문자 직접 저장
        char c5 = 44032;        //10진수로 저장
        char c6 = '\uac00';     //16진수로 저장

        int unicode = c1;       //유니코드 얻기

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(unicode);
    }
}
