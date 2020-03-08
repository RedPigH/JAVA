package ch2;

/*int 타입 변수에 어떤 진수로 입력을 하더라도 2진수로 변환되어 저장된다*/

public class IntExample {
    public static void main(String[] args) {
        int var1 = 10;          //10진수로 저장
        int var2 = 012;         //8진수로 저장
        int var3 = 0xA;         //16진수로 저장

        System.out.println(var1);       //rusult = 10
        System.out.println(var2);       //rusult = 10
        System.out.println(var3);       //rusult = 10
    }
}
